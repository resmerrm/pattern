package behavioral.template;

public class Latte extends Coffee {

    @Override
    void brewCoffee() {
        System.out.println("Brewing espresso");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding steamed milk");
    }
}

