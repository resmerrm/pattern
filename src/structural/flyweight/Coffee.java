package structural.flyweight;

public class Coffee {
    private final CoffeeType type;

    public Coffee(CoffeeType type) {
        this.type = type;
    }

    public void serveCoffee() {
        System.out.println("Serving " + type + " coffee");
    }
}

