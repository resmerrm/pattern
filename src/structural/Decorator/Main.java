package structural.Decorator;

public class Main {
    public static void main(String[] args) {
        // Создаем базовый кофе - Cappuccino
        Coffee cappuccino = new Cappuccino();
        System.out.println("Description: " + cappuccino.getDescription());
        System.out.println("Cost: $" + cappuccino.cost());

        // Добавляем молоко к Cappuccino
        cappuccino = new Milk(cappuccino);
        System.out.println("Description: " + cappuccino.getDescription());
        System.out.println("Cost: $" + cappuccino.cost());

        // Создаем базовый кофе - Latte
        Coffee latte = new Latte();
        System.out.println("Description: " + latte.getDescription());
        System.out.println("Cost: $" + latte.cost());

        // Добавляем молоко и шоколад к Latte
        latte = new Milk(latte);
        latte = new Chocolate(latte);
        System.out.println("Description: " + latte.getDescription());
        System.out.println("Cost: $" + latte.cost());
    }
}

