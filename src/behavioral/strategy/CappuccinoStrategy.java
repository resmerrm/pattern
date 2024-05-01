package behavioral.strategy;

public class CappuccinoStrategy implements CoffeeStrategy {
    @Override
    public void brew() {
        System.out.println("Приготовление капучино...");
        // Логика приготовления капучино
        System.out.println("Капучино готово!");
    }
}

