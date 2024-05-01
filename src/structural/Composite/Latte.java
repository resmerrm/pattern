package structural.Composite;

// Конкретный компонент: латте
public class Latte implements CoffeeComponent {
    private double price;

    public Latte(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

