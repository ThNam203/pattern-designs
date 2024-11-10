package Strategy.RefactoringGuru;

public class Main {
    public static void main(String[] args) {
        // Create different payment strategies
        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9876-5432");
        PaymentStrategy paypal = new PayPalPayment("paypal@payment.com");
        PaymentStrategy bitcoin = new BitcoinPayment("MyBitcoinAddress");

        ShoppingCart cart = new ShoppingCart(creditCard);
        cart.checkout(100);

        // Switch to PayPal payment strategy
        cart.setPaymentStrategy(paypal);
        cart.checkout(200);

        // Switch to Bitcoin payment strategy
        cart.setPaymentStrategy(bitcoin);
        cart.checkout(300);
    }
}
