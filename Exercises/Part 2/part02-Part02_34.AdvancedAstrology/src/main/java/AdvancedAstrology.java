
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            int j = size - i;
            printSpaces(j);
            printStars(i); 
        }
    }

    public static void christmasTree(int height) {
        for (int i = 1; i <= height; i++) {
            int j = i * 2 - 1;
            int k = height - i;
            printSpaces(k);
            printStars(j);  
        }
        int l = height - 2;
        int m;
        for (m = 0; m < l; m++) {
            System.out.print(" ");
        }
        System.out.println("***");
        for (m = 0; m < l; m++) {
            System.out.print(" ");
        }
        System.out.println("***");
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
