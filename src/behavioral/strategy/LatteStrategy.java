package behavioral.strategy;

public class LatteStrategy implements CoffeeStrategy {
    @Override
    public void brew() {
        System.out.println("Приготовление латте...");
        // Логика приготовления латте
        System.out.println("Латте готово!");
    }
}

