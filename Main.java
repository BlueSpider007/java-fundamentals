import java.util.Scanner;

public class Main {
    static boolean isPrime(int n) {
        if (n == 0 || n == 1 || n < 0) {
            return false;
        } else {
            boolean prime = true;
            for (int i = 2; i < n; i++) {
                if (n%i == 0) {
                    prime = false;
                }
            }
            return prime;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int k = 0; k < t; k++) {
            int n = sc.nextInt();
            if (isPrime(n)) {
                System.out.println(n + " is prime");
            } else {
                System.out.println(n + " is not prime");
            }
        }
    }
}
