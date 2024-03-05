package creational.factory.method;


public class CoffeeFactory {
    public static Coffee createCoffee(String type) {
        switch (type.toLowerCase()) {
            case "espresso":
                return new Espresso();
            case "latte":
                return new Lattee();
            case "cappuccino":
                return new Cappuccino();
            default:
                throw new IllegalArgumentException("Unknown coffee type: " + type);
        }
    }
}



