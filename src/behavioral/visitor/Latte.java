package behavioral.visitor;

public class Latte implements Coffee {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

