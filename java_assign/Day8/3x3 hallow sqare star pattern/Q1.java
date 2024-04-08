import java.util.Scanner;

public class ThreeHollowSquares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side length of the hollow square: ");
        int sideLength = scanner.nextInt();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < sideLength; j++) {
                // Loop for each square
                for (int k = 0; k < 3; k++) {
                    if (j == 0 || j == sideLength - 1 || k == 0 || k == 2) {
                        for (int l = 0; l < sideLength; l++) {
                            System.out.print("* ");
                        }
                    } else {
                        for (int l = 0; l < sideLength; l++) {
                            if (l == 0 || l == sideLength - 1) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                    }
                    
                    System.out.print("  ");
                }
                System.out.println(); // Move to the next line
            }
           
            System.out.println(); // Move to the next line
        }

        scanner.close();
    }
}
