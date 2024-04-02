package structural.Facade;

// Фасад для кофейного автомата
public class CoffeeMachineFacade {
    private MilkSystem milkSystem;
    private CoffeeSystem coffeeSystem;
    private SugarSystem sugarSystem;

    public CoffeeMachineFacade() {
        this.milkSystem = new MilkSystem();
        this.coffeeSystem = new CoffeeSystem();
        this.sugarSystem = new SugarSystem();
    }

    // Метод для приготовления кофе с молоком и сахаром
    public void makeCoffeeWithMilkAndSugar() {
        milkSystem.addMilk();
        coffeeSystem.brewCoffee();
        sugarSystem.addSugar();
        System.out.println("Coffee with milk and sugar is ready!");
    }
}

