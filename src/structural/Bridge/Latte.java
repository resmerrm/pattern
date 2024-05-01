package structural.Bridge;

// Конкретная реализация для латте
class Latte extends Coffee {
    public Latte(CoffeeMaker coffeeMaker) {
        super(coffeeMaker);
    }

    @Override
    void prepareCoffee() {
        System.out.println("Приготовление латте:");
        coffeeMaker.makeCoffee();
    }
}


