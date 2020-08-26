
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Integer input = Integer.valueOf(scanner.nextLine());
        for (input = input; input <= 100; input++) {
            System.out.println(input);
        }

    }
}
