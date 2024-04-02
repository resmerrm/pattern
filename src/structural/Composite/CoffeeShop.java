package structural.Composite;

public class CoffeeShop {
    public static void main(String[] args) {
        // Создаем отдельные виды кофе
        Coffee blackCoffee = new Coffee("Black Coffee");
        Coffee latte = new Coffee("Latte");

        // Создаем комплексный набор напитков
        CompositeDrink combo = new CompositeDrink();
        combo.addDrink(blackCoffee);
        combo.addDrink(latte);

        // Заказываем отдельные виды кофе
        blackCoffee.make();
        latte.make();

        // Заказываем комплексный набор напитков
        System.out.println("Making combo:");
        combo.make();
    }
}

