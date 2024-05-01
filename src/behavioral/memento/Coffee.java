package behavioral.memento;

public class Coffee {
    private String type;
    private int quantity;

    public Coffee(String type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Memento saveToMemento() {
        return new Memento(type, quantity);
    }

    public void restoreFromMemento(Memento memento) {
        this.type = memento.getType();
        this.quantity = memento.getQuantity();
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}

