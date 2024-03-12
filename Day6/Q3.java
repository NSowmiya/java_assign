import java.util.Scanner;

public class WithoutPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] noPrimeArray = createArrayWithoutPrimes(rows, columns, scanner);

        System.out.println("2D Array with no prime numbers:");
        for(int i=0;i<rows;i++){
          for(int j=0;j<columns;j++){
              System.out.print(noPrimeArray[i][j]+" ");
          }
          System.out.println();
      }
     
    }

    public static int[][] createArrayWithoutPrimes(int rows, int columns, Scanner scanner) {
        int[][] array = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter values for index "+i+" "+j+" :");
                int value = scanner.nextInt();

                while (isPrime(value)) {
                    System.out.println("Prime numbers are not allowed. Please enter another value:");
                    value = scanner.nextInt();
                }

                array[i][j] = value;
            }
        }

        return array;
    }
   

    public static boolean isPrime(int n) {
      if (n <= 1) {
          return false;
      }
      for (int i = 2; i <= Math.sqrt(n); i++) {
          if (n % i == 0) {
              return false; 
          }
      }
      return true; 
  }
    
}