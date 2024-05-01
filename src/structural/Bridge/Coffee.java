package structural.Bridge;

abstract class Coffee {
    protected CoffeeMaker coffeeMaker;

    public Coffee(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    abstract void prepareCoffee();
}


