package structural.Composite;
import java.util.ArrayList;
import java.util.List;

// Композитный компонент, содержащий в себе другие компоненты
public class CompositeCoffee implements CoffeeComponent {
    private List<CoffeeComponent> components = new ArrayList<>();

    // Добавление компонента
    public void addComponent(CoffeeComponent component) {
        components.add(component);
    }

    // Удаление компонента
    public void removeComponent(CoffeeComponent component) {
        components.remove(component);
    }

    @Override
    public double getPrice() {
        double totalPrice = 0;
        for (CoffeeComponent component : components) {
            totalPrice += component.getPrice();
        }
        return totalPrice;
    }
}

