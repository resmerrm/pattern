package structural.Bridge;

public abstract class Coffee {
    protected Additive additive;

    public Coffee(Additive additive) {
        this.additive = additive;
    }

    public abstract void makeCoffee();
}

