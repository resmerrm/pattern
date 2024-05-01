package behavioral.chain;

public class Main {
    public static void main(String[] args) {
        CoffeeShop coffeeShop = new CoffeeShop();
        coffeeShop.placeOrder(new CoffeeOrder("cappuccino"));
        coffeeShop.placeOrder(new CoffeeOrder("latte"));
        coffeeShop.placeOrder(new CoffeeOrder("espresso"));
    }
}
