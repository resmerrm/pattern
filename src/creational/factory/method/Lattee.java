package creational.factory.method;

public class Lattee extends Coffee {
    public Lattee() {
        name = "Latte";
        price = 3.5;
    }

    @Override
    public void brew() {
        System.out.println("Brewing latte...");
    }
}

