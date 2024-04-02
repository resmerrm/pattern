package structural.proxy;

// Реальная реализация заказа кофе
public class RealOrder implements Order {
    private final String coffeeType;

    public RealOrder(String coffeeType) {
        this.coffeeType = coffeeType;
    }

    @Override
    public void fulfillOrder() {
        System.out.println("Fulfilling order: " + coffeeType);
    }
}

