package Strategy.RefactoringGuru;

// Concrete Strategy 2: PayPal Payment
public class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal. Email: " + email);
    }
}