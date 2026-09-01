package Interface;
public class TopLevelInterfaceDemo {
    public static void main(String[] args) {
        StripeProcessor processor = new StripeProcessor();
        
        processor.processPayment(250.00);
        processor.sendReceipt("user@example.com", 250.00);
    }
}