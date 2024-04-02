package structural.Bridge;

// Конкретная реализация добавки - сахар
public class Sugar implements Additive {
    @Override
    public String add() {
        return "Sugar";
    }
}
