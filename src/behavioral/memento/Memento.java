package behavioral.memento;

public class Memento {
    private final String type;
    private final int quantity;

    public Memento(String type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }
}

