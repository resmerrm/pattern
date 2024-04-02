package structural.Adapter;

public class Espresso extends Coffee {
    @Override
    public void brew() {
        System.out.println("Brewing Espresso");
    }
}