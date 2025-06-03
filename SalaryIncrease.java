import java.util.Scanner;

public class SalaryIncrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();

        double increase = 0;
        int percent = 0;

        if (salary <= 400.00) {
            percent = 15;
        } else if (salary <= 800.00) {
            percent = 12;
        } else if (salary <= 1200.00) {
            percent = 10;
        } else if (salary <= 2000.00) {
            percent = 7;
        } else {
            percent = 4;
        }

        increase = salary * percent / 100.0;
        double newSalary = salary + increase;

        System.out.printf("New salary: %.2f%n", newSalary);
        System.out.printf("Increase: %.2f%n", increase);
        System.out.printf("Percent: %d %%\n", percent);

        sc.close();
    }
}
