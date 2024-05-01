package behavioral.visitor;

public class Main {
    public static void main(String[] args) {
        Coffee cappuccino = new Cappuccino();
        Coffee latte = new Latte();

        PriceVisitor priceVisitor = new PriceVisitor();

        cappuccino.accept(priceVisitor);
        latte.accept(priceVisitor);

        System.out.println("Total price: $" + priceVisitor.getTotalPrice());
    }
}

