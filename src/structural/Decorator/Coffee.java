package structural.Decorator;

public class Coffee implements Drink {
    @Override
    public String getDescription() {
        return "Coffee";
    }

    @Override
    public double cost() {
        return 2.0;
    }
}

