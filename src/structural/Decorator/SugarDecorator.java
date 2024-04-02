package structural.Decorator;

public class SugarDecorator implements Drink {
    private Drink drink;

    public SugarDecorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Sugar";
    }

    @Override
    public double cost() {
        return drink.cost() + 0.3;
    }
}

