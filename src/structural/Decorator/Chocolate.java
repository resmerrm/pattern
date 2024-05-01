package structural.Decorator;

public class Chocolate extends CoffeeDecorator {
    private Coffee coffee;

    public Chocolate(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription() + ", Chocolate";
    }

    public double cost() {
        return coffee.cost() + 1.5;
    }
}

