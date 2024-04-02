package structural.Adapter;

public class CoffeeFactoryAdapter {
    private CoffeeFactory coffeeFactory;

    public CoffeeFactoryAdapter() {
        this.coffeeFactory = new CoffeeFactory();
    }

    public Coffee getCoffee(String type) {
        return coffeeFactory.createCoffee(type);
    }
}
