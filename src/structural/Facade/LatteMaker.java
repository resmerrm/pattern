package structural.Facade;

public class LatteMaker {
    public void prepareLatte() {
        grindCoffeeBeans();
        brewEspresso();
        steamMilk();
        mixAndPour();
    }

    private void grindCoffeeBeans() {
        System.out.println("Grinding coffee beans...");
    }

    private void brewEspresso() {
        System.out.println("Brewing espresso...");
    }

    private void steamMilk() {
        System.out.println("Steaming milk...");
    }

    private void mixAndPour() {
        System.out.println("Mixing espresso and milk, pouring latte.");
    }
}

