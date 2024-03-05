package creational.singleton;

import java.util.HashMap;
import java.util.Map;

public class CoffeeFactory {
    private static CoffeeFactory instance;
    private Map<String, Coffee> prototypes;

    private CoffeeFactory() {
        prototypes = new HashMap<>();
        prototypes.put("espresso", new Espresso());
        prototypes.put("latte", new Latte());
        prototypes.put("cappuccino", new Cappuccino());
    }

    public static synchronized CoffeeFactory getInstance() {
        if (instance == null) {
            instance = new CoffeeFactory();
        }
        return instance;
    }

    public Coffee createCoffee(String type) {
        return prototypes.get(type);
    }
}
