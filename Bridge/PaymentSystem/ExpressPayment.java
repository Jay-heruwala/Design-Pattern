package Bridge.PaymentSystem;

public class ExpressPayment extends Payment{

    ExpressPayment(PaymentProcessor paymentProcessor){
        super(paymentProcessor);
    }

    @Override
    String makePayment(double amount) {
        return this.processor.processPayment(amount) + " by using the express payment";
    }
}
