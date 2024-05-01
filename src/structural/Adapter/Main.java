package structural.Adapter;

public class Main {
    public static void main(String[] args) {
        Cappuccino cappuccino = new Cappuccino();
        Latte latte = new Latte();

        CoffeeMachine cappuccinoMachine = new CappuccinoAdapter(cappuccino);
        CoffeeMachine latteMachine = new LatteAdapter(latte);

        System.out.println("Making Cappuccino:");
        cappuccinoMachine.makeCoffee();

        System.out.println("\nMaking Latte:");
        latteMachine.makeCoffee();
    }
}
