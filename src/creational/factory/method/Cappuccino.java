package creational.factory.method;

public class Cappuccino extends Coffee {
    public Cappuccino() {
        name = "Cappuccino";
        price = 3.0;
    }

    @Override
    public void brew() {
        System.out.println("Brewing cappuccino...");
    }
}
