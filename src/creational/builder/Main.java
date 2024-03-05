package creational.builder;

public class Main {
    public static void main(String[] args) {
        // Создаем объект кофе с помощью Builder
        Coffee coffee = new Coffee.Builder("Эспрессо")
                .milk(50)
                .sugar(2)
                .build();

        // Создаем кофейный магазин
        CoffeeShop coffeeShop = new CoffeeShop();

        // Продаем кофе
        coffeeShop.sellCoffee(coffee);
    }
}

