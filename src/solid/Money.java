package solid;

public class Money {
    private int dollars;
    private int cents;

    public Money(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
    }

    public void displayAmount() {
        System.out.println("Amount: $" + dollars + "." + cents);
    }

    // Додаткові методи для роботи з грошима
}
