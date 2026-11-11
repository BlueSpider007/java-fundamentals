import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(line.toUpperCase().substring(line.indexOf(' ')+1));
        sb.append(", ");
        sb.append(line.toUpperCase().charAt(0));
        sb.append('.');
        System.out.println(sb);
    }
}
