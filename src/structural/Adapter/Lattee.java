package structural.Adapter;

class Latte implements Coffee {
    @Override
    public void brew() {
        System.out.println("Brewing a tasty Latte!");
    }
}
