package structural.Composite;

public class Coffee implements Drink {
    private String name;

    public Coffee(String name) {
        this.name = name;
    }

    @Override
    public void make() {
        System.out.println("Making " + name);
    }
}

