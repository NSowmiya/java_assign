import java.util.Scanner;

public class ThreeHollowSquareRows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

               System.out.print("Enter the side length of the hollow square: ");
        int sideLength = scanner.nextInt();


        for (int i = 0; i < 3; i++) {
            for (int j = 1; j <= sideLength; j++) {
                
                for (int k = 1; k <= sideLength; k++) {
                    if (j == 1 || j == sideLength || k == 1 || k == sideLength) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                
                if (i < 2) {
                    System.out.print("  ");
                }
                System.out.println();
            }
            if (i < 2) {
                System.out.println();
            }
        }

        scanner.close();
    }
}
