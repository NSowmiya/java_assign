import java.util.Arrays;

public class SortNames {
    public static void main(String[] args) {
        String[] friends = {"Ram", "Tara", "Vikki", "David", "Bama", "Sowmi", "Nagu", "Keerthu", "Logi", "Pavi"};

        Arrays.sort(friends);

        System.out.println("Sorted names:");
        for (String friend : friends) {
            System.out.println(friend);
        }
    }
}
