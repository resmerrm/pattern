package structural.Adapter;

class Cappuccino implements Coffee {
    @Override
    public void brew() {
        System.out.println("Brewing a delicious Cappuccino!");
    }
}
