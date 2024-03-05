package creational.factory.method;

public class Espresso extends Coffee {
    public Espresso() {
        name = "Espresso";
        price = 2.0;
    }

    @Override
    public void brew() {
        System.out.println("Brewing espresso...");
    }
}
