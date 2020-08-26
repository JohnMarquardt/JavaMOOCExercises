
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int smallest = 2147483647;
        int current;

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            
            list.add(input);
        }

        System.out.println("");
        
        for (int i = 0; i < list.size(); i++) {
            current = list.get(i);
            if (current < smallest) {
            smallest = current;
        }
        System.out.println("Smallest number: " + smallest);
        
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j) == smallest) {
                System.out.println("Found at index: " + j);
            }
        }
            
        }
    }
}
