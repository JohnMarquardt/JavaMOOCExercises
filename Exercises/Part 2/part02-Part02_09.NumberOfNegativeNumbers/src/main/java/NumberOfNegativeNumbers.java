
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = 0;
        
        while (true) {
            System.out.println("Give a number: ");
            Integer input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                System.out.println("Number of negative numbers: " + numbers);
                break;
            } 
            if (input < 0) {
                numbers = numbers + 1;
            }
        }
    }
}
