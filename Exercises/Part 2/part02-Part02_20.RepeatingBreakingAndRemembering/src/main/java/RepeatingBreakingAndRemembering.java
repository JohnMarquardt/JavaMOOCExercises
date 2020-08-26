
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0;
        int number = 0;
        double average;
        int odd = 0;
        int even = 0;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            if (input % 2 == 1) {
                odd++;
            }
            if (input % 2 == 0) {
                even++;
            }
            if (input != -1) {
                sum = sum + input;
                number++;
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + number);
        average = (1.0 * sum)/number;
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd " + odd);
    }
}
