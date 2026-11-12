import java.util.Scanner;

public class Main {
    static class Employee {
        protected String name;
        protected int base;

        Employee(String name, int base) {
            this.name = name;
            this.base = base;
        }

        int monthlyPay() {
            return base;
        }

        String describe() {
            return name + ": " + monthlyPay();
        }
    }

    static class Manager extends Employee {
        protected int team;

        Manager(String name, int base, int team) {
            super(name, base);
            this.team = team;
        }

        @Override
        int monthlyPay() {
            return base + 500*team;
        }
    }

    static class Intern extends Employee {
        Intern(String name, int base) {
            super(name, base);
        }

        @Override
        int monthlyPay() {
            return base/2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Employee[] staff = new Employee[n];
        for (int i = 0; i < n; i++) {
            String kind = sc.next();
            String name = sc.next();
            int base = sc.nextInt();
            if (kind.equals("M")) {
                staff[i] = new Manager(name, base, sc.nextInt());
            } else if (kind.equals("I")) {
                staff[i] = new Intern(name, base);
            } else {
                staff[i] = new Employee(name, base);
            }
        }
        int total = 0;
        for (Employee e : staff) {
            System.out.println(e.describe());
            total += e.monthlyPay();
        }
        System.out.println("Total: " + total);
    }
}
