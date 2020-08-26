
import java.util.ArrayList;
import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            }
            list.add(input);
        }
    }
    public static int sum(ArrayList<Integer> numbers) {
        int a = 0;
        for (int i = 0; i < numbers.size(); i++) {
            a = a + numbers.get(i);
            
        } 
        return a;
    }
}
