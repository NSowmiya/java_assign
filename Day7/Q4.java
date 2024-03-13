import java.util.Scanner;

public class RightDownTriangleNumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the height of the triangle from the user
        System.out.print("Enter the height of the triangle: ");
        int n = scanner.nextInt();

        // Print the right-down triangle number pattern
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }

            // Print the numbers
            for (int k = i; k <= n; k++) {
                System.out.print(k + " ");
            }

            System.out.println();
        }

        scanner.close();
    }
}
