package structural.Facade;

public class CoffeeFacade {
    private CappuccinoMaker cappuccinoMaker;
    private LatteMaker latteMaker;

    public CoffeeFacade() {
        cappuccinoMaker = new CappuccinoMaker();
        latteMaker = new LatteMaker();
    }

    public void makeCappuccino() {
        System.out.println("=== Making a Cappuccino ===");
        cappuccinoMaker.prepareCappuccino();
        System.out.println("Cappuccino is ready!\n");
    }

    public void makeLatte() {
        System.out.println("=== Making a Latte ===");
        latteMaker.prepareLatte();
        System.out.println("Latte is ready!\n");
    }
}

