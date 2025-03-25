package Bridge.PaymentSystem;

public abstract class Payment {
    PaymentProcessor processor;
    Payment(PaymentProcessor paymentProcessor){
        this.processor = paymentProcessor;
    }

    abstract String makePayment(double amount);
}
