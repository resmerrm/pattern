package structural.Facade;

public class CappuccinoMaker {
    public void prepareCappuccino() {
        grindCoffeeBeans();
        brewEspresso();
        frothMilk();
        mixAndPour();
    }

    private void grindCoffeeBeans() {
        System.out.println("Grinding coffee beans...");
    }

    private void brewEspresso() {
        System.out.println("Brewing espresso...");
    }

    private void frothMilk() {
        System.out.println("Frothing milk...");
    }

    private void mixAndPour() {
        System.out.println("Mixing espresso and milk, pouring cappuccino.");
    }
}

