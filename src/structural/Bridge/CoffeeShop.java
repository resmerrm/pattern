package structural.Bridge;

public class CoffeeShop {
    public static void main(String[] args) {
        // Создаем кофейный магазин
        Coffee blackCoffee = new BlackCoffee(new Milk());
        blackCoffee.makeCoffee();

        Coffee latte = new Latte(new Sugar());
        latte.makeCoffee();
    }
}

