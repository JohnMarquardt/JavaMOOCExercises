
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int sum = 0;
        System.out.println("First number?");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int last = Integer.valueOf(scanner.nextLine());
        for (i = first; i <= last; i++) {
            sum = sum + i;
        }
        System.out.println("The sum is: " + sum);

    }
}
