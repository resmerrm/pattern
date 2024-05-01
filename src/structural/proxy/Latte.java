package structural.proxy;

public class Latte implements Coffee {
    @Override
    public void makeCoffee() {
        System.out.println("Making Latte...");
    }
}