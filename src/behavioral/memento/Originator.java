package behavioral.memento;

public class Originator {
    private Coffee coffee;

    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    public Memento saveToMemento() {
        return coffee.saveToMemento();
    }

    public void restoreFromMemento(Memento memento) {
        coffee.restoreFromMemento(memento);
    }
}

