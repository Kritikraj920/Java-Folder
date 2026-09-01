package Interface;

// TOP-LEVEL INTERFACE 1
public interface PaymentGateway {
    // Interface Field (public static final)
    String CURRENCY = "USD";

    // Abstract Method
    void processPayment(double amount);
}