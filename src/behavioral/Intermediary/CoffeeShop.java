package behavioral.Intermediary;

public class CoffeeShop implements CoffeeMediator {
    private Customer customer;
    private Barista barista;
    private CoffeeMachine coffeeMachine;

    public CoffeeShop() {
        this.customer = new Customer(this);
        this.barista = new Barista(this);
        this.coffeeMachine = new CoffeeMachine();
    }

    @Override
    public void order(String coffeeType) {
        coffeeMachine.order(coffeeType);
    }

    @Override
    public void prepare(String coffeeType) {
        barista.prepareCoffee(coffeeType);
    }

    @Override
    public void serve(String coffeeType) {
        System.out.println("Кофе готово. Подавайте клиенту.");
    }

    public Customer getCustomer() {
        return customer;
    }
}
