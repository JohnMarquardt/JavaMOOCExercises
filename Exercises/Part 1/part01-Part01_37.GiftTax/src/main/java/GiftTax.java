
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bOne = 5000;
        int bTwo = 20000;
        int bThree = 30000;
        int bFour = 145000;
        int bFive = 800000;
        double tax = 0;
        
        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scanner.nextLine());
        if (value > bFive + bFour + bThree + bTwo + bOne) {
            tax = (value - 1000000) * .17 + 142100;
            System.out.println("Tax: " + tax);
        } else if (value > bFour + bThree + bTwo + bOne) {
            tax = (value - 200000) * .15 + 22100;
            System.out.println("Tax: " + tax);
        } else if (value > bThree + bTwo + bOne) {
            tax = (value - 55000) * .12 + 4700;
            System.out.println("Tax: " + tax);
        } else if (value > bTwo + bOne) {
            tax = (value - 25000) * .10 + 1700;
            System.out.println("Tax: " + tax);
        } else if (value > bOne) {
            tax = (value - 5000) * .08 + 100;
            System.out.println("Tax: " + tax);
        } else {
            System.out.println("No tax!");
        }
    }
}
