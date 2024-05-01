package solid;

public interface Reporting {
    void registerIncoming(Product product, int quantity, String date);
    void registerOutgoing(Product product, int quantity, String date);
    void generateInventoryReport();
}
