import java.util.Scanner;

public class Main {
    static String evaluate(String line) {
        // TODO: return the result, or "bad format" / "bad number" / "divide by zero".
        String[] parts = line.split("/");
        if (parts.length != 2) {
            return "bad format";
        }
        try {
            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[1]);
            if (b == 0) {
                throw new ArithmeticException();
            }

            return String.valueOf(a/b);
        } catch (NumberFormatException e) {
            return "bad number";
        } catch (ArithmeticException e) {
            return "divide by zero";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            System.out.println(evaluate(sc.nextLine()));
        }
    }
}
