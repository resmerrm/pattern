package behavioral.command;

public class CappuccinoCommand implements Command {
    private CoffeeMachine coffeeMachine;

    public CappuccinoCommand(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void execute() {
        coffeeMachine.makeCappuccino();
    }
}

