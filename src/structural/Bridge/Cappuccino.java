package structural.Bridge;

// Конкретная реализация для капучино
class Cappuccino extends Coffee {
    public Cappuccino(CoffeeMaker coffeeMaker) {
        super(coffeeMaker);
    }

    @Override
    void prepareCoffee() {
        System.out.println("Приготовление капучино:");
        coffeeMaker.makeCoffee();
    }
}

