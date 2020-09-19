
import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> suitcase;
    private int maxWeight;
    private int totalWeight = 0;
    
    public Suitcase(int maxWeight) {
        this.suitcase = new ArrayList<>();
        this.totalWeight = totalWeight;
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item) {
        if (this.totalWeight + item.getWeight() <= this.maxWeight) {
            this.totalWeight += item.getWeight();
            this.suitcase.add(item);
        }
    }
    
    public String toString() {
        if (this.suitcase.isEmpty()) {
            return "no items (0 kg)";
        }
        if (this.suitcase.size() == 1) {
            return "1 item (" + totalWeight + ") kg";
        }
        return suitcase.size() + " items (" + totalWeight + " kg)";
    }
    
    public void printItems() {
        for (Item i: suitcase) {
            System.out.println(i);
        }
    }
    
    public int totalWeight() {
        return totalWeight;
    }
    
    public Item heaviestItem() {
        if (this.suitcase.isEmpty()) {
            return null;
        }
        Item heavyItem = suitcase.get(0);
        for (Item i: suitcase) {
            if (i.getWeight() > heavyItem.getWeight()) {
                heavyItem = i;
            }
        }
        return heavyItem;
    }
}
