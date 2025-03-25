package Strategy.BasicPaymentSystem;

public class CreditCardStrategy implements PaymentStrategy {

    @Override
    public String pay(double amount) {
        return amount + " is payed using credit-card";
    }
}
