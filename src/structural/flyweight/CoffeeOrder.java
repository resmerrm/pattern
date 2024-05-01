package structural.flyweight;

public class CoffeeOrder {
    private final Coffee coffee;

    public CoffeeOrder(Coffee coffee) {
        this.coffee = coffee;
    }

    public void serve() {
        System.out.println("Serving coffee: " + coffee.getType());
    }
}

