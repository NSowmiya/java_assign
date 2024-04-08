public class Multable {
    public static void main(String[] args) {
        printMultable(15, 1);
    }

    static void printMultable(int num, int i) {
        if (i <= 10) {
            System.out.println(num + " x " + i + " = " + (num * i));
            printMultable(num, i + 1);
        }
    }
}
