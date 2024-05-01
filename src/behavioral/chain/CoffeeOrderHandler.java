package behavioral.chain;

public interface CoffeeOrderHandler {
    void handleOrder(CoffeeOrder order);
    void setNextHandler(CoffeeOrderHandler nextHandler);
}

