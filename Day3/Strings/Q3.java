import java.util.Scanner;

public class CharCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();

        calculateCharCounts(inputString);
    }

    public static void calculateCharCounts(String inputString) {
        int vowels = 0, consonants = 0, digits = 0, whiteSpaces = 0;

        inputString = inputString.toLowerCase();

        for (char ch : inputString.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (ch >= '0' && ch <= '9') {
                digits++;
            } else if (ch == ' ') {
                whiteSpaces++;
            }
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        System.out.println("Number of digits: " + digits);
        System.out.println("Number of white spaces: " + whiteSpaces);
    }
}

