import java.util.Scanner;

public class NameAbbr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String fullName = scanner.nextLine();

        String[] names = fullName.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < names.length - 1; i++) {
            result.append(names[i].charAt(0)).append(".");
        }
        result.append(names[names.length - 1]);

        System.out.println("Abbreviation: " + result.toString());
    }
}
