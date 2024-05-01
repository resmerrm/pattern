package behavioral.chain;

public class LatteHandler implements CoffeeOrderHandler {
    private CoffeeOrderHandler nextHandler;

    @Override
    public void handleOrder(CoffeeOrder order) {
        if (order.getType().equalsIgnoreCase("latte")) {
            System.out.println("Ваше замовлення: латте");
        } else {
            nextHandler.handleOrder(order);
        }
    }

    @Override
    public void setNextHandler(CoffeeOrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
