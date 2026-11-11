import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();

        final int seconds = total % 60;
        total /= 60;
        final int minutes = total % 60;
        total /= 60;
        final int hours = total % 24;
        total /= 24;
        final int days = total;
        System.out.println(days + " days " + hours + " hours " + minutes + " minutes " + seconds + " seconds");
    }
}
