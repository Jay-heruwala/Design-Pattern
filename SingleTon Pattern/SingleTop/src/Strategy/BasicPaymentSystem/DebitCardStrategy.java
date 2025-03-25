package Strategy.BasicPaymentSystem;

public class DebitCardStrategy implements PaymentStrategy {
    @Override
    public String pay(double amount) {
        return amount + " is payed using debit-card";
    }
}
