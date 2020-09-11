package observer.stock;

public interface Observer {
    void update(double ibmPrice, double applePrice, double googlePrice);
}
