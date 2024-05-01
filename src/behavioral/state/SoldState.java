package behavioral.state;

public class SoldState implements CoffeeState {
    private CoffeeMachine coffeeMachine;

    public SoldState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void selectCoffee() {
        System.out.println("Already brewing coffee");
    }

    @Override
    public void insertMoney() {
        System.out.println("Already brewing coffee");
    }

    @Override
    public void dispenseCoffee() {
        System.out.println("Coffee dispensed");
        coffeeMachine.setState(coffeeMachine.getNoCoffeeState());
    }
}

