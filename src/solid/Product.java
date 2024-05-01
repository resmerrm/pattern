package solid;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void reducePrice(double amount) {
        this.price -= amount;
    }

    // Додаткові методи для роботи з продуктом
}
