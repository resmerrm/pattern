package behavioral.state;

public class NoCoffeeState implements CoffeeState {
    private CoffeeMachine coffeeMachine;

    public NoCoffeeState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void selectCoffee() {
        System.out.println("Please insert money first");
    }

    @Override
    public void insertMoney() {
        System.out.println("Money inserted");
        coffeeMachine.setState(coffeeMachine.getHasMoneyState());
    }

    @Override
    public void dispenseCoffee() {
        System.out.println("No coffee selected");
    }
}

