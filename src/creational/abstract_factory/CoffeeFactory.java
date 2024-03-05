package creational.abstract_factory;

public class CoffeeFactory {
    public Coffee createCoffee(String type) {
        switch (type) {
            case "espresso":
                return new Espresso();
            case "latte":
                return new Latte();
            case "cappuccino":
                return new Cappuccino();
            default:
                throw new IllegalArgumentException("Unknown coffee type: " + type);
        }
    }
}
