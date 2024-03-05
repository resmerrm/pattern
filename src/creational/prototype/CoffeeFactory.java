package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class CoffeeFactory {
    private static final Map<String, Coffee> prototypes = new HashMap<>();

    static {
        prototypes.put("espresso", new Espresso());
        prototypes.put("latte", new Latte());
        prototypes.put("cappuccino", new Cappuccino());
    }

    public Coffee createCoffee(String type) throws CloneNotSupportedException {
        return (Coffee) prototypes.get(type).clone();
    }
}
