
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        
        System.out.println("Where to?");
        int end = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int start = Integer.valueOf(scanner.nextLine());
        for (i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
}
