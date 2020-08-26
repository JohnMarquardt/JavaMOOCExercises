
public class Product {
    private String name;
    private int quantity;
    private double price;
    
    public Product(String name, double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
        this.name = name;
    }
    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + ", " + this.quantity);
    }
}
