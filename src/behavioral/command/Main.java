package behavioral.command;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Command cappuccinoCommand = new CappuccinoCommand(coffeeMachine);
        Command latteCommand = new LatteCommand(coffeeMachine);

        Waiter waiter = new Waiter(cappuccinoCommand, latteCommand);

        // Заказываем капучино
        waiter.takeOrderCappuccino();

        // Заказываем латте
        waiter.takeOrderLatte();
    }
}
