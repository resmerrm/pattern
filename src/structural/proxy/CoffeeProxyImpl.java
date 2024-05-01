package structural.proxy;

public class CoffeeProxyImpl implements CoffeeProxy {
    private Coffee coffee;

    public CoffeeProxyImpl(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void serveCoffee() {
        System.out.println("Welcome! Your coffee is being prepared...");
        coffee.makeCoffee();
        System.out.println("Enjoy your coffee!");
    }
}

