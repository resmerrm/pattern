package structural.Bridge;

public class BlackCoffee extends Coffee {
    public BlackCoffee(Additive additive) {
        super(additive);
    }

    @Override
    public void makeCoffee() {
        System.out.println("Making Black Coffee with " + additive.add());
    }
}

