package Bridge.PaymentSystem;

public class Main {
    public static void main(String[] args) {
        Payment payment = new StandardPayment(new CreditCardProcessor());
        System.out.println(payment.makePayment(1000.00));

        Payment payment1 = new ExpressPayment(new CreditCardProcessor());
        System.out.println(payment1.makePayment(100.00));
    }
}
