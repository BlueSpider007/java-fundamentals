import java.util.Scanner;

public class Main {
    interface Formatter {
        String format(String s);

        // TODO: apply this formatter first, then next.
        default Formatter andThen(Formatter next) {
            return s -> next.format(this.format(s));
        }
    }

    static class Shout implements Formatter {
        @Override
        public String format(String s) {
            return s.toUpperCase()+"!";
        }
    }

    static class Whisper implements Formatter {
        @Override
        public String format(String s) {
            return s.toLowerCase();
        }
    }

    static class Reverse implements Formatter {
        @Override
        public String format(String s) {
            return new StringBuilder(s).reverse().toString();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        int k = Integer.parseInt(sc.nextLine().trim());
        Formatter all = s -> s;
        for (int i = 0; i < k; i++) {
            String rule = sc.nextLine().trim();
            Formatter f;
            if (rule.equals("shout")) {
                f = new Shout();
            } else if (rule.equals("whisper")) {
                f = new Whisper();
            } else {
                f = new Reverse();
            }
            all = all.andThen(f);
        }
        System.out.println(all.format(msg));
    }
}
