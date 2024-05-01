package behavioral.Intermediary;

public interface CoffeeMediator {
    void order(String coffeeType);
    void prepare(String coffeeType);
    void serve(String coffeeType);
}
