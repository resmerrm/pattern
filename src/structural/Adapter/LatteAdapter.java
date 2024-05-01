package structural.Adapter;

class LatteAdapter implements CoffeeMachine {
    private Latte latte;

    public LatteAdapter(Latte latte) {
        this.latte = latte;
    }

    @Override
    public void makeCoffee() {
        latte.brew();
    }
}

