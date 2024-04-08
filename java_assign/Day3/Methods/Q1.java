import java.util.Scanner;

public class MaxMinNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        printMaxNumber(num1, num2, num3);
        printMinNumber(num1, num2, num3);

        scanner.close();
    }

    static void printMaxNumber(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        System.out.println("Maximum number: " + max);
    }

    static void printMinNumber(double a, double b, double c) {
        double min = Math.min(a, Math.min(b, c));
        System.out.println("Minimum number: " + min);
    }
}
