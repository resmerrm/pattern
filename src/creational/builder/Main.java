package creational.builder;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee.Builder("Эспрессо")
                .milk(50)
                .sugar(2)
                .build();

        CoffeeShop coffeeShop = new CoffeeShop();

        // Продаем кофе
        coffeeShop.sellCoffee(coffee);
    }
}

