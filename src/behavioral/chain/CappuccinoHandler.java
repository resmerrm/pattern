package behavioral.chain;

public class CappuccinoHandler implements CoffeeOrderHandler {
    private CoffeeOrderHandler nextHandler;

    @Override
    public void handleOrder(CoffeeOrder order) {
        if (order.getType().equalsIgnoreCase("cappuccino")) {
            System.out.println("Ваше замовлення: капучино");
        } else {
            nextHandler.handleOrder(order);
        }
    }

    @Override
    public void setNextHandler(CoffeeOrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}

