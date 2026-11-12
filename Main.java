import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = Arrays.stream(sc.nextLine().split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();
        // Build the pipeline over nums and print the result line.
        String ans = Arrays.stream(nums)
            .filter(i -> !(i%2==0))
            .mapToObj(i -> i*i)
            .sorted()
            .map(i -> i+"")
            .distinct()
            .collect(Collectors.joining(" "));
        System.out.println(ans);
    }
}
