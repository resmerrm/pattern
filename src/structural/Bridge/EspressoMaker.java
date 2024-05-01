package structural.Bridge;

// Реализация CoffeeMaker для эспрессо
class EspressoMaker implements CoffeeMaker {
    @Override
    public void makeCoffee() {
        System.out.println("Готовим эспрессо");
    }
}

