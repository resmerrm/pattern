package behavioral.state;

public class CoffeeMachine {
    private CoffeeState noCoffeeState;
    private CoffeeState hasMoneyState;
    private CoffeeState soldState;
    private CoffeeState currentState;

    public CoffeeMachine() {
        noCoffeeState = new NoCoffeeState(this);
        hasMoneyState = new HasMoneyState(this);
        soldState = new SoldState(this);
        currentState = noCoffeeState;
    }

    public void setState(CoffeeState state) {
        this.currentState = state;
    }

    public CoffeeState getNoCoffeeState() {
        return noCoffeeState;
    }

    public CoffeeState getHasMoneyState() {
        return hasMoneyState;
    }

    public CoffeeState getSoldState() {
        return soldState;
    }

    public void selectCoffee() {
        currentState.selectCoffee();
    }

    public void insertMoney() {
        currentState.insertMoney();
    }

    public void dispenseCoffee() {
        currentState.dispenseCoffee();
    }
}

