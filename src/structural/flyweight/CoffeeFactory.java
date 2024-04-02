package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

// Фабрика для создания и хранения различных видов кофе
public class CoffeeFactory {
    private static final Map<CoffeeType, Coffee> coffeeMap = new HashMap<>();

    public static Coffee getCoffee(CoffeeType type) {
        coffeeMap.putIfAbsent(type, new Coffee(type));
        return coffeeMap.get(type);
    }
}

