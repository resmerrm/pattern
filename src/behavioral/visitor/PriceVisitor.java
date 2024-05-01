package behavioral.visitor;

public class PriceVisitor implements Visitor {
    private double totalPrice = 0;

    @Override
    public void visit(Cappuccino cappuccino) {
        totalPrice += 3.5; // Цена капучино
    }

    @Override
    public void visit(Latte latte) {
        totalPrice += 4.0; // Цена латте
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}

