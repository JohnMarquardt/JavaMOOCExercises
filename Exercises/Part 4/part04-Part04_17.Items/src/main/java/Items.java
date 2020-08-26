
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input == "") {
                break;
            } 
            items.add(input);
            input.toString();
            
        }
        
    }
}
