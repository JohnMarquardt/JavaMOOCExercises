
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = 0;

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        System.out.println("Search for?");
        int input = Integer.valueOf(scanner.nextLine());
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == input) {
                    index = i;
                    System.out.println(input + " is at index " + index);
                }
            }

    }
}
