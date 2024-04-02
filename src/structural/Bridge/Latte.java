package structural.Bridge;


public class Latte extends Coffee {
    public Latte(Additive additive) {
        super(additive);
    }

    @Override
    public void makeCoffee() {
        System.out.println("Making Latte with " + additive.add());
    }
}

