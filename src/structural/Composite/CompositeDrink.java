package structural.Composite;

import java.util.ArrayList;
import java.util.List;

// Класс для представления комплексного набора напитков
public class CompositeDrink implements Drink {
    private List<Drink> drinks = new ArrayList<>();

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public void removeDrink(Drink drink) {
        drinks.remove(drink);
    }

    @Override
    public void make() {
        for (Drink drink : drinks) {
            drink.make();
        }
    }
}

