package structural.Decorator;

public class CoffeeShop {
    public static void main(String[] args) {
        // Создаем базовый кофе
        Drink coffee = new Coffee();
        System.out.println("Description: " + coffee.getDescription() + ", Cost: $" + coffee.cost());

        // Добавляем молоко
        Drink coffeeWithMilk = new MilkDecorator(coffee);
        System.out.println("Description: " + coffeeWithMilk.getDescription() + ", Cost: $" + coffeeWithMilk.cost());

        // Добавляем молоко и сахар
        Drink coffeeWithMilkAndSugar = new SugarDecorator(new MilkDecorator(coffee));
        System.out.println("Description: " + coffeeWithMilkAndSugar.getDescription() + ", Cost: $" + coffeeWithMilkAndSugar.cost());
    }
}

