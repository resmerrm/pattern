package structural.proxy;

public class Cappuccino implements Coffee {
    @Override
    public void makeCoffee() {
        System.out.println("Making Cappuccino...");
    }
}

