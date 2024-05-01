package structural.Decorator;

public class Latte extends Coffee {
    public Latte() {
        description = "Latte";
    }

    public double cost() {
        return 4.0;
    }
}

