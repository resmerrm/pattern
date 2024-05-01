package behavioral.strategy;

public class CoffeeShop {
    private CoffeeStrategy coffeeStrategy;

    public CoffeeShop(CoffeeStrategy coffeeStrategy) {
        this.coffeeStrategy = coffeeStrategy;
    }

    public void setCoffeeStrategy(CoffeeStrategy coffeeStrategy) {
        this.coffeeStrategy = coffeeStrategy;
    }

    public void brewCoffee() {
        coffeeStrategy.brew();
    }

    public static void main(String[] args) {
        // Пример использования
        CoffeeStrategy cappuccinoStrategy = new CappuccinoStrategy();
        CoffeeStrategy latteStrategy = new LatteStrategy();

        CoffeeShop coffeeShop = new CoffeeShop(cappuccinoStrategy);
        coffeeShop.brewCoffee();

        coffeeShop.setCoffeeStrategy(latteStrategy);
        coffeeShop.brewCoffee();
    }
}

