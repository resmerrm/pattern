package creational.factory.method;

public abstract class Coffee {
    protected String name;
    protected double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract void brew();
}


