package creational.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        CoffeeFactory coffeeFactory = new CoffeeFactory();

        Coffee coffee1 = coffeeFactory.createCoffee("espresso");
        coffee1.brew();

        Coffee coffee2 = coffeeFactory.createCoffee("latte");
        coffee2.brew();

        Coffee coffee3 = coffeeFactory.createCoffee("cappuccino");
        coffee3.brew();
    }
}
