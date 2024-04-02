package structural.Decorator;

public class MilkDecorator implements Drink {
    private Drink drink;

    public MilkDecorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return drink.cost() + 0.5;
    }
}

