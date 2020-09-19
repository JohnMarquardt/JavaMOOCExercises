
import java.util.ArrayList;

public class Hold {
    private int weight;
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
        this.weight = weight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.weight + suitcase.totalWeight() <= this.maxWeight) {
            this.suitcases.add(suitcase);
            this.weight += suitcase.totalWeight();
        }
    }
    
    public String toString() {
        return suitcases.size() + " suitcases (" + weight + " kg)";
    }
    
    public void printItems() {
        for (Suitcase i: suitcases) {
            i.printItems();
        }
    }
}
