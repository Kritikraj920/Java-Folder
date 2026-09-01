package Interface;

// Class implementing multiple top-level interfaces
public class StripeProcessor implements PaymentGateway, Notifier {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing " + CURRENCY + " " + amount + " via Stripe...");
    }

    @Override
    public void sendReceipt(String email, double amount) {
        System.out.println("Receipt sent to " + email + " for amount: " + amount);
    }
}