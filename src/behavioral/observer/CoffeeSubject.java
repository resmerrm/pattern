package behavioral.observer;

// Интерфейс для субъекта
public interface CoffeeSubject {
    void registerObserver(CoffeeObserver observer);
    void removeObserver(CoffeeObserver observer);
    void notifyObservers();
}


