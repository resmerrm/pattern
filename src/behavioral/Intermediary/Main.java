package behavioral.Intermediary;

public class Main {
    public static void main(String[] args) {
        CoffeeShop coffeeShop = new CoffeeShop();
        Customer customer = coffeeShop.getCustomer();

        customer.orderCoffee("Капучино");
    }
}

