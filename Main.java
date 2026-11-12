import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean b;
        if (year % 400 == 0) {
            b = true;
        } else if (year % 100 == 0) {
            b = false;
        } else {
            b = year % 4 == 0 ? true : false;
        }
        System.out.println(b?"leap":"common");
    }
}
