package Bridge.PaymentSystem;

public class CreditCardProcessor implements PaymentProcessor{
    @Override
    public String processPayment(double amount) {
        return amount + " payed by using the Credit card";
    }
}
