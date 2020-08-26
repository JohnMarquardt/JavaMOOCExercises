
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Statistics whole = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int typed = 0;
        System.out.println("Enter numbers:");
        
        while (true) {
            
            typed = Integer.valueOf(scanner.nextLine());
            input = typed;
            if (input == -1)
                break;
            if (input % 2 == 0) {
                even.addNumber(input);
            }
            if (input % 2 == 1) {
                odd.addNumber(input);
            }
            
            whole.addNumber(input);
        }
        System.out.println("Sum: " + whole.getSum());
        System.out.println("Sum of even numbers: " + even.getSum());
        System.out.println("Sum of odd numbers: " + odd.getSum());
        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        
        //create an instance of Statistics named "a"
    }
}
