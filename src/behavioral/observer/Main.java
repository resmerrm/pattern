package behavioral.observer;

public class Main {
    public static void main(String[] args) {
        // Создание кофейного магазина
        CoffeeShop coffeeShop = new CoffeeShop();

        // Создание отображения текущих продаж
        CurrentSalesDisplay currentSalesDisplay = new CurrentSalesDisplay();

        // Регистрация отображения текущих продаж в качестве наблюдателя
        coffeeShop.registerObserver(currentSalesDisplay);

        // Продажа кофе
        coffeeShop.sellCappuccino(10);
        coffeeShop.sellLatte(5);
    }
}

