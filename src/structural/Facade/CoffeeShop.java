package structural.Facade;

// Точка входа в программу
public class CoffeeShop {
    public static void main(String[] args) {
        // Создаем фасад кофейного автомата
        CoffeeMachineFacade coffeeMachine = new CoffeeMachineFacade();

        // Заказываем кофе с молоком и сахаром через фасад
        coffeeMachine.makeCoffeeWithMilkAndSugar();
    }
}


