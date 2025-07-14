import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] words = { "on", "job", "lake" };
        runIterative(words).forEach(System.out::println);
    }

    public static List<String> runIterative(String[] words) {
        List<String> result = new ArrayList<>();
        result.add("");

        for (String word : words) {
            List<String> next = new ArrayList<>();
            for (String prefix : result) {
                for (char c : word.toCharArray()) {
                    next.add(prefix + c);
                }
            }
            result = next;
        }

        return result;
    }

}