package Bridge.PaymentSystem;

public class StandardPayment extends Payment{

    StandardPayment(PaymentProcessor paymentProcessor){
        super(paymentProcessor);
    }

    @Override
    public String makePayment(double amount) {
        return this.processor.processPayment(amount) + " by using the Standard Payment";
    }
}
