package behavioral.state;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        // Продажа кофе без денег
        coffeeMachine.selectCoffee();
        coffeeMachine.dispenseCoffee();

        // Вставка денег и выбор кофе
        coffeeMachine.insertMoney();
        coffeeMachine.selectCoffee();
        coffeeMachine.dispenseCoffee();

        // Выбор кофе без вставки денег
        coffeeMachine.selectCoffee();
        coffeeMachine.dispenseCoffee();
    }
}
