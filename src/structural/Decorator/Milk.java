package structural.Decorator;

public class Milk extends CoffeeDecorator {
    private Coffee coffee;

    public Milk(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    public double cost() {
        return coffee.cost() + 1.0;
    }
}

