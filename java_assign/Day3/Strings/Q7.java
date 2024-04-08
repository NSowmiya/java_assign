import java.util.Scanner;

public class ReplaceSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.println("Enter the old substring to replace: ");
        String oldSubstring = scanner.nextLine();

        System.out.println("Enter the new substring: ");
        String newSubstring = scanner.nextLine();

        String result = sentence.replace(oldSubstring, newSubstring);
        System.out.println("Result: " + result);
    }
}
