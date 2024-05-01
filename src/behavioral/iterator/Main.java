package behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        CoffeeMenu coffeeMenu = new CoffeeMenu();

        System.out.println("Selling coffee:");
        for (Coffee coffee : coffeeMenu) {
            System.out.println(coffee.getName() + ": $" + coffee.getPrice());
        }
    }
}
