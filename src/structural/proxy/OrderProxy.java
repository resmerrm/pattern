package structural.proxy;

// Прокси для управления доступом к заказу
public class OrderProxy implements Order {
    private final String coffeeType;
    private RealOrder realOrder;

    public OrderProxy(String coffeeType) {
        this.coffeeType = coffeeType;
    }

    @Override
    public void fulfillOrder() {
        if (realOrder == null) {
            realOrder = new RealOrder(coffeeType);
        }
        // Дополнительная логика, если необходимо
        System.out.println("Proxy: Validating order...");
        realOrder.fulfillOrder();
    }
}

