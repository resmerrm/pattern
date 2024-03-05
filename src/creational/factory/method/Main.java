package creational.factory.method;

public class Main {
    public static void main(String[] args) {
        // Продажа кофе
        sellCoffee("espresso");
        sellCoffee("latte");
        sellCoffee("cappuccino");
    }

    public static void sellCoffee(String type) {
        Coffee coffee = CoffeeFactory.createCoffee(type);
        System.out.println("Selling " + coffee.getName() + " for $" + coffee.getPrice());
        coffee.brew();
    }
}
