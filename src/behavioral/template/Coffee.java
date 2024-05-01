package behavioral.template;

public abstract class Coffee {

    // Метод, который определяет шаблон для приготовления кофе
    public final void prepareCoffee() {
        boilWater();
        brewCoffee();
        pourInCup();
        addCondiments();
    }

    // Методы, которые будут реализованы в конкретных подклассах
    abstract void brewCoffee();
    abstract void addCondiments();

    // Общие методы
    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}

