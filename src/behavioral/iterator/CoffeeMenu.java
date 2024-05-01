package behavioral.iterator;
import java.util.Iterator;

public class CoffeeMenu implements Iterable<Coffee> {
    private static final int MAX_COFFEES = 2;
    private Coffee[] coffees;
    private int size;

    public CoffeeMenu() {
        coffees = new Coffee[MAX_COFFEES];
        addCoffee("Cappuccino", 3.50);
        addCoffee("Latte", 4.00);
    }

    private void addCoffee(String name, double price) {
        if (size < MAX_COFFEES) {
            coffees[size++] = new Coffee(name, price);
        }
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    private class CoffeeIterator implements Iterator<Coffee> {
        private int position;

        @Override
        public boolean hasNext() {
            return position < size && coffees[position] != null;
        }

        @Override
        public Coffee next() {
            return coffees[position++];
        }
    }
}
