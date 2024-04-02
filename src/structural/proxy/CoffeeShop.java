package structural.proxy;

public class CoffeeShop {
    public static void main(String[] args) {
        // Создаем заказ через прокси
        Order order = new OrderProxy("Latte");
        // Выполняем заказ
        order.fulfillOrder();
    }
}

