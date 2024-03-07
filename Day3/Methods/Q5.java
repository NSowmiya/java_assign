import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your gross salary: ");
        double grossSalary = scanner.nextDouble();
        System.out.print("Enter your total savings: ");
        double totalSavings = scanner.nextDouble();

        double tax = taxCalculator(grossSalary, totalSavings);
        System.out.println("Tax to be paid: " + tax);

        scanner.close();
    }

    static double taxCalculator(double grossSalary, double totalSavings) {
        double taxableIncome = Math.max(grossSalary - Math.min(totalSavings, 100000), 0);
        
        if (taxableIncome <= 100000) {
            return 0;
        } else if (taxableIncome <= 200000) {
            return 0.1 * (taxableIncome - 100000);
        } else if (taxableIncome <= 500000) {
            return 0.1 * (100000) + 0.2 * (taxableIncome - 200000);
        } else {
            return 0.1 * (100000) + 0.2 * (300000) + 0.3 * (taxableIncome - 500000);
        }
    }
}
