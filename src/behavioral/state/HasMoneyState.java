package behavioral.state;

public class HasMoneyState implements CoffeeState {
    private CoffeeMachine coffeeMachine;

    public HasMoneyState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void selectCoffee() {
        System.out.println("Coffee selected");
        coffeeMachine.setState(coffeeMachine.getSoldState());
    }

    @Override
    public void insertMoney() {
        System.out.println("Money already inserted");
    }

    @Override
    public void dispenseCoffee() {
        System.out.println("Please select coffee first");
    }
}
