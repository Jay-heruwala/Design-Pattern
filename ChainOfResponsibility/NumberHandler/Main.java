package ChainOfResponsibility.NumberHandler;

public class Main {
    public static void main(String[] args) {
        Num request = new Num(10);
        NegativeHandler negativeHandler = new NegativeHandler();
        PositiveHandler positiveHandler = new PositiveHandler();
        ZeroHandler zeroHandler = new ZeroHandler();

        negativeHandler.setNext(zeroHandler);
        zeroHandler.setNext(positiveHandler);
        positiveHandler.setNext(negativeHandler);

        negativeHandler.process(request);
    }
}
