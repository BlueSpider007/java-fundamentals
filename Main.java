import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int qty = Integer.parseInt(sc.nextLine().trim());
        double price = Double.parseDouble(sc.nextLine().trim());
        price *= qty;

        System.out.printf("%-12s%4d%10.2f%n",name,qty,price);
    }
}
