import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    private static boolean isPalindrome(String str) {
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return cleanStr.equals(new StringBuilder(cleanStr).reverse().toString());
    }
}
