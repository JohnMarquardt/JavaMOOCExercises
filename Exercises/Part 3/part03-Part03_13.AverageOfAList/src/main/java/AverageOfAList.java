
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double average = 0.0;
        double sum = 0.0;
        
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            
            list.add(input);
        }
        
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
            
        }
        average = sum / list.size();
        System.out.println(average);
    }
}
