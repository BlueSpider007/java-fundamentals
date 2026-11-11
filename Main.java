import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Print the true sum of a and b.
        long c = (long) a+b;
        System.out.println(c);
    }
}
