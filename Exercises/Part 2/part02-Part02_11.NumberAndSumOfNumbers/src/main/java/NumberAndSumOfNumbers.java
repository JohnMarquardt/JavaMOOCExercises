
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        
        while (true) {
            System.out.println("Give a number: ");
            Integer input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                System.out.println("Number of numbers: " + number);
                System.out.println("Sum of the numbers: " + sum);
                break;
            }
            if (input != 0) {
                sum = sum + input;
                number = number + 1;
            }
        }

    }
}
