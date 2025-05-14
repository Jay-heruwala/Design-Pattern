package ChainOfResponsibility.NumberHandler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Num request = new Num(10);
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();


        Manager negativeHandler = new Manager();
        Director positiveHandler = new Director();
        CEO zeroHandler = new CEO();

        negativeHandler.setNext(positiveHandler);
        positiveHandler.setNext(zeroHandler);

        negativeHandler.process(amount);
    }
}
