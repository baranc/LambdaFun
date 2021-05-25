import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Challenge4 {
    public static void main(String[] args) {
        List<String> topNames = Arrays.asList("Wojciech", "Adam", "dawid", "Kamil", "Mateusz",
                "Oliwia", "zuzanna", "Jolanta", "anna", "magdalena");
        System.out.println(topNames);

//        topNames = topNames.stream().map((0)).sorted().collect(Collectors.toList());
//        System.out.println(topNames);

        List<String> firstUpperCase = new ArrayList<>();
        List<String> finalTopNames = topNames;
        List<String> finalFirstUpperCase = firstUpperCase;
        topNames.forEach(name ->
                finalFirstUpperCase.add(name.substring(0,1).toUpperCase(Locale.ROOT) + name.substring(1)));
        firstUpperCase.sort((s1, s2) -> s1.compareTo(s2));
        firstUpperCase.forEach(System.out::println);


        System.out.println(firstUpperCase);
        firstUpperCase = firstUpperCase.stream().sorted().collect(Collectors.toList());
        System.out.println(firstUpperCase);
    }
}
