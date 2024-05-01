package behavioral.template;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee cappuccino = new Cappuccino();
        Coffee latte = new Latte();

        System.out.println("Preparing Cappuccino...");
        cappuccino.prepareCoffee();

        System.out.println("\nPreparing Latte...");
        latte.prepareCoffee();
    }
}

