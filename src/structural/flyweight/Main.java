package structural.flyweight;

public class Main {
    public static void main(String[] args) {
        CoffeeFlyweightFactory coffeeFactory = new CoffeeFlyweightFactory();

        // Создаем заказы
        CoffeeOrder order1 = new CoffeeOrder(coffeeFactory.getCoffee("Cappuccino"));
        CoffeeOrder order2 = new CoffeeOrder(coffeeFactory.getCoffee("Cappuccino"));
        CoffeeOrder order3 = new CoffeeOrder(coffeeFactory.getCoffee("Latte"));
        CoffeeOrder order4 = new CoffeeOrder(coffeeFactory.getCoffee("Latte"));

        // Сервировка заказов
        order1.serve();
        order2.serve();
        order3.serve();
        order4.serve();
    }
}

