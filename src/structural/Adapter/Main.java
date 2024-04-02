package structural.Adapter;

public class Main {
    public static void main(String[] args) {
        CoffeeFactoryAdapter coffeeFactoryAdapter = new CoffeeFactoryAdapter();

        // Пример использования адаптера
        Coffee coffee1 = coffeeFactoryAdapter.getCoffee("espresso");
        coffee1.brew();

        Coffee coffee2 = coffeeFactoryAdapter.getCoffee("latte");
        coffee2.brew();

        Coffee coffee3 = coffeeFactoryAdapter.getCoffee("cappuccino");
        coffee3.brew();
    }
}