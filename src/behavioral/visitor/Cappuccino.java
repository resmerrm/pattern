package behavioral.visitor;

public class Cappuccino implements Coffee {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
