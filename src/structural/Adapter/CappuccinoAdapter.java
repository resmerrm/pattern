package structural.Adapter;

class CappuccinoAdapter implements CoffeeMachine {
    private Cappuccino cappuccino;

    public CappuccinoAdapter(Cappuccino cappuccino) {
        this.cappuccino = cappuccino;
    }

    @Override
    public void makeCoffee() {
        cappuccino.brew();
    }
}

