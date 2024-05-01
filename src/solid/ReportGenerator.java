package solid;

public class ReportGenerator implements Reporting {
    @Override
    public void registerIncoming(Product product, int quantity, String date) {
        // Логіка реєстрації надходження товару
    }

    @Override
    public void registerOutgoing(Product product, int quantity, String date) {
        // Логіка реєстрації відвантаження товару
    }

    @Override
    public void generateInventoryReport() {
        // Логіка генерації звіту по інвентаризації
    }
}
