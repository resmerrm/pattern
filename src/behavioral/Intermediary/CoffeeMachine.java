package behavioral.Intermediary;

public class CoffeeMachine implements CoffeeMediator {
    @Override
    public void order(String coffeeType) {
        prepare(coffeeType);
    }

    @Override
    public void prepare(String coffeeType) {
        System.out.println("Приготовление " + coffeeType);
    }

    @Override
    public void serve(String coffeeType) {
        System.out.println(coffeeType + " подано.");
    }
}

