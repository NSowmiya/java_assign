import java.util.Scanner;

public class RightTriangleStarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the height of the triangle: ");
        int n = scanner.nextInt();

      
        for (int i = 1; i <= n; i++) {
            // Print spaces before the stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        scanner.close();
    }
}
