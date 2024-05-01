package structural.proxy;

public class Main {
    public static void main(String[] args) {
        // Создаем объекты капучино и латте
        Coffee cappuccino = new Cappuccino();
        Coffee latte = new Latte();

        // Создаем прокси для капучино и латте
        CoffeeProxy cappuccinoProxy = new CoffeeProxyImpl(cappuccino);
        CoffeeProxy latteProxy = new CoffeeProxyImpl(latte);

        // Заказываем кофе через прокси
        System.out.println("Ordering Cappuccino:");
        cappuccinoProxy.serveCoffee();

        System.out.println();

        System.out.println("Ordering Latte:");
        latteProxy.serveCoffee();
    }
}

