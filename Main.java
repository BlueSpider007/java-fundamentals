import java.util.Scanner;

public class Main {
    static class Account {
        private int balance;
        Account(int opening) {
            balance = opening;
        }

        void deposit(int amount) {
            if (amount > 0) {
                balance += amount;
            }
        }

        boolean withdraw(int amount) {
            if (0 < amount && amount <= balance) {
                balance -= amount;
                return true;
            } else {
                return false;
            }
        }

        int getBalance() {
            return balance;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account acct = new Account(sc.nextInt());
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String cmd = sc.next();
            if (cmd.equals("deposit")) {
                acct.deposit(sc.nextInt());
            } else if (cmd.equals("withdraw")) {
                if (!acct.withdraw(sc.nextInt())) {
                    System.out.println("insufficient funds");
                }
            } else {
                System.out.println("balance: " + acct.getBalance());
            }
        }
    }
}
