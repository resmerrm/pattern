package structural.flyweight;

public class CoffeeShop {
    public static void main(String[] args) {
        // Заказываем несколько видов кофе через фабрику
        Coffee blackCoffee = CoffeeFactory.getCoffee(CoffeeType.BLACK_COFFEE);
        blackCoffee.serveCoffee();

        Coffee latte = CoffeeFactory.getCoffee(CoffeeType.LATTE);
        latte.serveCoffee();

        // Проверяем, что объекты кофе действительно являются разными объектами
        System.out.println("blackCoffee == latte: " + (blackCoffee == latte)); // Выведет "false"
    }
}

