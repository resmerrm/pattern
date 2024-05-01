package structural.Bridge;

public class Main {
    public static void main(String[] args) {
        // Для капучино используем EspressoMaker
        Coffee cappuccino = new Cappuccino(new EspressoMaker());
        cappuccino.prepareCoffee();

        System.out.println();

        // Для латте используем MilkCoffeeMaker
        Coffee latte = new Latte(new MilkCoffeeMaker());
        latte.prepareCoffee();
    }
}

