package behavioral.visitor;

public interface Visitor {
    void visit(Cappuccino cappuccino);
    void visit(Latte latte);
}

