import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Challenge5 {
    public static void main(String[] args) {
        List<String> topNames = Arrays.asList("Wojciech", "Adam", "dawid", "Kamil", "Mateusz",
                "Oliwia", "zuzanna", "Jolanta", "anna", "magdalena");
        System.out.println(topNames);

        List<String> firstUpperCase = new ArrayList<>();
        List<String> finalFirstUpperCase = firstUpperCase;
        topNames.forEach(name ->
                finalFirstUpperCase.add(name.substring(0,1).toUpperCase(Locale.ROOT) + name.substring(1)));
        firstUpperCase.sort(String::compareTo);
        firstUpperCase.forEach(System.out::println);
    }
}