
import java.util.Scanner;

public class TextUI {
    private SimpleDictionary simpleDictionary;
    private Scanner scanner;
    
    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.simpleDictionary = simpleDictionary;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command: ");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            if (input.equals("add")) {
                System.out.println("Word:");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                this.simpleDictionary.add(word, translation);
                continue;
            } 
            if (input.equals("search")) {
                System.out.println("To be translated:");
                String search = scanner.nextLine();
                String translation = simpleDictionary.translate(search);
                if (translation == null) {
                    System.out.println("Word " + search + " was not found");
                } else {
                    System.out.println("Translation: " + translation);
                }
                continue;
            } else {
                System.out.println("Unknown command");
                continue;
            }
        }
    }
}
