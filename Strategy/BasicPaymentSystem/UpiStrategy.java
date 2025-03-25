package Strategy.BasicPaymentSystem;

public class UpiStrategy implements PaymentStrategy {
    @Override
    public String pay(double amount) {
        return amount + " is payed by using UPI";
    }
}
