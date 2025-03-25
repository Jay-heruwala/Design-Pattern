package Strategy.BasicPaymentSystem;

public class ShoppingPayment {
    private PaymentStrategy strategy;
    ShoppingPayment(PaymentStrategy strategy){
        this.strategy = strategy;
    }

    public String payment(double amount){
        return this.strategy.pay(amount);
    }
}
