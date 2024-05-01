package behavioral.chain;

public class CoffeeShop {
    private CoffeeOrderHandler firstHandler;

    public CoffeeShop() {
        // Ініціалізуємо ланцюжок обробки
        firstHandler = new CappuccinoHandler();
        CoffeeOrderHandler latteHandler = new LatteHandler();
        firstHandler.setNextHandler(latteHandler);
    }

    public void placeOrder(CoffeeOrder order) {
        firstHandler.handleOrder(order);
    }
}
