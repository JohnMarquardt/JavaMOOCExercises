
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a string:");
        String inputOne = scanner.nextLine();
        System.out.println("Give an integer:");
        int inputTwo = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        double inputThree = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean inputFour = Boolean.valueOf(scanner.nextLine());
        System.out.println("You gave the string " + inputOne);
        System.out.println("You gave the integer " + inputTwo);
        System.out.println("You gave the double " + inputThree);
        System.out.println("You gave the boolean " + inputFour);

    }
}
