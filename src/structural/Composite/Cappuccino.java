package structural.Composite;

// Конкретный компонент: капучино
public class Cappuccino implements CoffeeComponent {
    private double price;

    public Cappuccino(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

