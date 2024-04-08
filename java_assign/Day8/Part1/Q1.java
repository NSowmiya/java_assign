import java.util.Scanner;

public class HollowSquarePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the side length of the hollow square: ");
        int sideLength = scanner.nextInt();


        for (int i = 1; i <= sideLength; i++) {
            for (int j = 1; j <= sideLength; j++) {
               
                if (i == 1 || i == sideLength || j == 1 || j == sideLength) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); // Move to the next line
        }

        scanner.close();
    }
}
