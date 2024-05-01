package behavioral.Intermediary;

public class Barista {
    private CoffeeMediator mediator;

    public Barista(CoffeeMediator mediator) {
        this.mediator = mediator;
    }

    public void prepareCoffee(String coffeeType) {
        System.out.println("Бариста: начинаю приготовление " + coffeeType);
        mediator.prepare(coffeeType);
        mediator.serve(coffeeType);
    }
}

