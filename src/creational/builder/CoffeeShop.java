package creational.builder;

public class CoffeeShop {
    public void sellCoffee(Coffee coffee) {
        System.out.println("Продан кофе: " + coffee.getType() +
                " с молоком: " + coffee.getMilk() +
                " и сахаром: " + coffee.getSugar());
    }
}
