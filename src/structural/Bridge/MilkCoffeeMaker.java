package structural.Bridge;

// Реализация CoffeeMaker для кофе с молоком
class MilkCoffeeMaker implements CoffeeMaker {
    @Override
    public void makeCoffee() {
        System.out.println("Готовим кофе с молоком");
    }
}

