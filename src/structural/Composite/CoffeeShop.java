package structural.Composite;

public class CoffeeShop {
    public static void main(String[] args) {
        // Создаем капучино и латте с указанием цен
        Cappuccino cappuccino = new Cappuccino(3.5);
        Latte latte = new Latte(4.0);

        // Создаем композитный объект и добавляем в него капучино и латте
        CompositeCoffee compositeCoffee = new CompositeCoffee();
        compositeCoffee.addComponent(cappuccino);
        compositeCoffee.addComponent(latte);

        // Получаем общую стоимость
        double total = compositeCoffee.getPrice();
        System.out.println("Total: $" + total);
    }
}

