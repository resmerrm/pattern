package structural.Facade;

public class Main {
    public static void main(String[] args) {
        CoffeeFacade coffeeFacade = new CoffeeFacade();

        System.out.println("=== Ordering a Cappuccino ===");
        coffeeFacade.makeCappuccino();

        System.out.println("=== Ordering a Latte ===");
        coffeeFacade.makeLatte();
    }
}

