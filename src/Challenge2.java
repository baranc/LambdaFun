import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Challenge2 {
    //static IntPredicate predicate = (index) -> index % 2 == 1;
    public static void main(String[] args) {
        String example = "Human";
        System.out.println(everySecondChar(example));
        System.out.println("----------------------------------------------");
        System.out.println(isSecond("Human"));
        //System.out.println(stringFunction.apply("1234567890"));
        //System.out.println(getStringFunction("1234567890"));
        System.out.println(everySecondCharacter(stringFunction, "1234567890"));
    }
    public static String everySecondChar(String source){
        StringBuilder returnVal = new StringBuilder();
        for(int i = 0; i < source.length(); i++){
            if(i % 2 == 1){
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();
    }
    public static String isSecond(String source){
        StringBuilder returnVal = new StringBuilder();
        IntPredicate predicate = (index) -> index % 2 == 1;
        for(int i = 0; i < source.length(); i++){
            if(predicate.test(i))
                returnVal.append(source.charAt(i));

        }
        return returnVal.toString();
    };

    static Function<String, String> stringFunction = source -> {
        StringBuilder returnVal = new StringBuilder();
        for(int i = 0; i < source.length(); i++){
            if(i % 2 == 1){
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();
    };

    public static String everySecondCharacter(Function<String, String> function, String source) {
        return function.apply(source);

    }


}
