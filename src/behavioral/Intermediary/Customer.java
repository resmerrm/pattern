package behavioral.Intermediary;

public class Customer {
    private CoffeeMediator mediator;

    public Customer(CoffeeMediator mediator) {
        this.mediator = mediator;
    }

    public void orderCoffee(String coffeeType) {
        System.out.println("Заказ: " + coffeeType);
        mediator.order(coffeeType);
    }
}
