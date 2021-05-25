import java.util.function.Supplier;

public class Challenge3 {

    public static void main(String[] args) {
        Supplier supplier = () -> new String("I love java");
        String result = (String) supplier.get();
        System.out.println(result);

        Supplier supplier1 = () -> "I love java";
        String result1 = (String) supplier1.get();
        System.out.println(result1);
    }

}
