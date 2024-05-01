package behavioral.observer;

public class CurrentSalesDisplay implements CoffeeObserver {
    private int currentCappuccinoSold;
    private int currentLatteSold;

    @Override
    public void update(int cappuccinoSold, int latteSold) {
        currentCappuccinoSold = cappuccinoSold;
        currentLatteSold = latteSold;
        display();
    }

    // Метод для отображения текущих продаж
    public void display() {
        System.out.println("Current Sales:");
        System.out.println("Cappuccino: " + currentCappuccinoSold);
        System.out.println("Latte: " + currentLatteSold);
        System.out.println();
    }
}

