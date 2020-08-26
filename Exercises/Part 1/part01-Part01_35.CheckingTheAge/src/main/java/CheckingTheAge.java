
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How old are you?");
        int age = Integer.valueOf(scanner.nextLine());
        if (0 > age || age > 120) {
            System.out.println("Impossible!");
        } else {
            System.out.println("OK");
        }

    }
}
