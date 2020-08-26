
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double number = 0;
        
        while (true) {
            
        
            Integer input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                if (number == 0) {
                    System.out.println("Cannot calculate the average");
                }
                System.out.println((sum * 1.0 / number));
                break;
            }
            if (input > 0) {
                sum = sum + input;
                number = number + 1;
            }
            
        }
    }
}
