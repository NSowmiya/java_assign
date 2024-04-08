import java.util.Scanner;

public class HollowTrianglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the height of the triangle: ");
        int height = scanner.nextInt();

        
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                // Print stars only at the boundaries (first row, last row, and first column)
                if (i == 1 || i == height || j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print spaces for the inner part
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
