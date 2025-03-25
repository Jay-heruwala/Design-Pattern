package Strategy.BasicPaymentSystem;

public class Main {
    public static void main(String[] args) {
        ShoppingPayment shoppingPayment = new ShoppingPayment(new BankTrasferStrategy());
        System.out.println("Bank Transfer : " + shoppingPayment.payment(10000.00));

        ShoppingPayment shoppingPayment1 = new ShoppingPayment(new CreditCardStrategy());
        System.out.println("Credit Card : " + shoppingPayment1.payment(1000.00));

        ShoppingPayment shoppingPayment2 = new ShoppingPayment(new DebitCardStrategy());
        System.out.println("Credit Card : " + shoppingPayment2.payment(500.00));

        ShoppingPayment shoppingPayment3 = new ShoppingPayment(new UpiStrategy());
        System.out.println("Upi payment : " + shoppingPayment3.payment(10.00));
    }
}
