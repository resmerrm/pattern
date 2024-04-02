package structural.Adapter;

import java.util.HashMap;
import java.util.Map;

public class CoffeeFactory {
    private static CoffeeFactory instance;
    private Map<String, Coffee> prototypes;

    public CoffeeFactory() {
        prototypes = new HashMap<>();
        prototypes.put("espresso", new Espresso());
        prototypes.put("latte", new Lattee());
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