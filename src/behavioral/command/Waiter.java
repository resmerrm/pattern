package behavioral.command;

public class Waiter {
    private Command cappuccinoCommand;
    private Command latteCommand;

    public Waiter(Command cappuccinoCommand, Command latteCommand) {
        this.cappuccinoCommand = cappuccinoCommand;
        this.latteCommand = latteCommand;
    }

    public void takeOrderCappuccino() {
        cappuccinoCommand.execute();
    }

    public void takeOrderLatte() {
        latteCommand.execute();
    }
}
