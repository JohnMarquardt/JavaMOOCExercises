
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you?");
        int input = Integer.valueOf(scanner.nextLine());
        if (input < 18) {
            System.out.println("You are not an adult");
        } else {
            System.out.println("You are an adult");
        }
    }
}