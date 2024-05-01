package behavioral.observer;
import java.util.ArrayList;
import java.util.List;

public class CoffeeShop implements CoffeeSubject {
    private int cappuccinoSold;
    private int latteSold;
    private List<CoffeeObserver> observers;

    public CoffeeShop() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(CoffeeObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(CoffeeObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (CoffeeObserver observer : observers) {
            observer.update(cappuccinoSold, latteSold);
        }
    }

    // Метод для обновления продаж капучино
    public void sellCappuccino(int quantity) {
        cappuccinoSold += quantity;
        notifyObservers();
    }

    // Метод для обновления продаж латте
    public void sellLatte(int quantity) {
        latteSold += quantity;
        notifyObservers();
    }
}

