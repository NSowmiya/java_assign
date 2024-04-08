import java.util.Scanner;

public class ThreeHollowSquaresSideBySide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the side length of the hollow square: ");
        int sideLength = scanner.nextInt();

      
        for (int i = 1; i <= sideLength; i++) {
            // Loop for each row in the squares
            for (int j = 0; j < 3; j++) {
                
                for (int k = 1; k <= sideLength; k++) {
                    
                    if (i == 1 || i == sideLength || k == 1 || k == sideLength || (j > 0 && (k == sideLength / 2 + 1 || k == 1 + sideLength * 2))) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }

                if (j < 2) {
                    System.out.print("  ");
                }
            }
            System.out.println(); // Move to the next line
        }

        scanner.close();
    }
}
