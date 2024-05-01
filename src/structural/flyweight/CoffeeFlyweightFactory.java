package structural.flyweight;
import java.util.HashMap;
import java.util.Map;

public class CoffeeFlyweightFactory {
    private Map<String, Coffee> coffeeMap = new HashMap<>();

    public Coffee getCoffee(String type) {
        Coffee coffee = coffeeMap.get(type);

        if (coffee == null) {
            coffee = new Coffee(type);
            coffeeMap.put(type, coffee);
        }

        return coffee;
    }
}
