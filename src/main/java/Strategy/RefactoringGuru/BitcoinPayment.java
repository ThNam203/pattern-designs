package Strategy.RefactoringGuru;

// Concrete Strategy 3: Bitcoin Payment
public class BitcoinPayment implements PaymentStrategy {
    private String bitcoinAddress;

    public BitcoinPayment(String bitcoinAddress) {
        this.bitcoinAddress = bitcoinAddress;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Bitcoin. Address: " + bitcoinAddress);
    }
}