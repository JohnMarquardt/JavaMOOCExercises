
import java.util.Scanner;

public class DivisibleByThree {
    public static void divisibleByThreeInRange(int first, int last) {
        for (int i = first; i <= last; i++) {
            while (i % 3 == 0) {
                System.out.println(i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer first = Integer.valueOf(scanner.nextLine());
        Integer last = Integer.valueOf(scanner.nextLine());
        divisibleByThreeInRange(first, last);

    }

}
