package Strategy.BasicPaymentSystem;

public class BankTrasferStrategy implements PaymentStrategy {
    @Override
    public String pay(double amount) {
        return amount + " is payed by using Bank Transfer";
    }
}
