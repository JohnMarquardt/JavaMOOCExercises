

import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = 0;
        int longest = 0;
        int sum = 0;
        int numbers = 0;
        double average = 0.0;
        String longName = ("");
        while (true) {
            String input = scanner.nextLine();
            numbers++;
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            len = parts[0].length();
            if (len > longest) {
                longest = len;
                longName = parts[0];
            }
            sum = sum + Integer.valueOf(parts[1]);
            average = 1.0 * sum / numbers;
        }
        System.out.println("Longest name: " + longName);
        System.out.println("Average of the birth years: " + average);

    }
}
