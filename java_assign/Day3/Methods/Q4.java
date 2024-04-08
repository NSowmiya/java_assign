public class Fibonacci {
    public static void main(String[] args) {
        int n = 5; // Change n to get the desired term
        int result = fibonacci(n);
        System.out.println("F(" + n + ") = " + result);
    }

    static int fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
