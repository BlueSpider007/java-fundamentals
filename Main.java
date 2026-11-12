import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] parts = sc.nextLine().split(" ");
        int[] nums = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            nums[i] = Integer.parseInt(parts[i]);
        }
        if (nums.length == 0) {
            System.out.println("none");
        } else {
            double avg = 0;
            for (int i : nums) {
                avg += i;
            }
            avg /= nums.length;

            StringBuilder sb = new StringBuilder();
            for (int i : nums) {
                if (i > avg) {
                    sb.append(i);
                    sb.append(" ");
                }
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
                System.out.println(sb);
            } else {
                System.out.println("none");
            }
        }
    }
}
