import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");
        LinkedHashMap<String, Integer> counts = new LinkedHashMap<>();

        for (String word : words) {
            counts.put(word, counts.getOrDefault(word, 0) + 1);
        }
        String ms = "";
        int mi = 0;
        for (String s : counts.keySet()) {
            if (counts.getOrDefault(s, 0) > mi) {
                ms = s;
                mi = counts.getOrDefault(s, 0);
            }
        }
        System.out.printf("%s %d%n", ms, mi);

    }
}
