public class RightTriangleNumberPattern {
    public static void main(String[] args) {
        int rows = 5; 
        for (int i = 1; i <= rows; i++) {
            // Inner loop for spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  "); 
            }
            
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
