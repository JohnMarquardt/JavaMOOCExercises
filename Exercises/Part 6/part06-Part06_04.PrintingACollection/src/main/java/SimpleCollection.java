
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String getName() {
        return this.name;
    }
    
    @Override public String toString() {
        String elementsInList = "";
        
        for (String element: elements) {
            elementsInList = elementsInList + "\n" + element;
        }
        if (elements.isEmpty()) {
            return "The collection " + this.getName() + " is empty.";
        }
        if (elements.size() == 1) {
            return "The collection " + this.getName() + " has 1 element:" + elementsInList;
            
        }
        return "The collection " + this.getName() + " has " + elements.size() + " elements:" + elementsInList;
    }
}