package behavioral.command;

public class LatteCommand implements Command {
    private CoffeeMachine coffeeMachine;

    public LatteCommand(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void execute() {
        coffeeMachine.makeLatte();
    }
}
