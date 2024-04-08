public class ReplacePalindrome {
    public static void main(String[] args) {
        String input = "bob has a radar plane";
        String[] words = input.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            if (isPalindrome(words[i])) {
                words[i] = "*".repeat(words[i].length());
            }
        }

        String result = String.join(" ", words);
        System.out.println("Result: " + result);
    }

    private static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
