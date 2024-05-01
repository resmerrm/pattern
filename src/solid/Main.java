package solid;

public class Main {
    public static void main(String[] args) {
        Money money = new Money(10, 50);
        money.displayAmount();

        Product product = new Product("Laptop", 1000);
        product.reducePrice(100);

        Warehouse warehouse = new Warehouse();
        // Ініціалізація об'єкта складу та виконання операцій з ним

        Reporting reportGenerator = new ReportGenerator();
        // Використання методів для генерації звітів
    }
}

