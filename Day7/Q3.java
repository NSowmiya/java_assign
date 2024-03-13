import java.util.Scanner;

public class LeftDownTriangleNumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the height of the triangle: ");
        int n = scanner.nextInt();


        for (int i = 1; i <= n; i++) {
            
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        scanner.close();
    }
}
