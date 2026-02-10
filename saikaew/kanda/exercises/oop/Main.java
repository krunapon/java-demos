class Product {
    private String id;
    private double price;

    public Product(String id, double price) {
        this.id = id;
        this.price = price;
    }

    public Product() {
        this("P001", 9.99);
    }
}

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
    }
}
