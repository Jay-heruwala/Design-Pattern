package DetailCompo;

import java.util.Scanner;

public class ClientCode {
    public static void main(String[] args) {
        Factory factory = null;
        Component component = null;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Os : ");
        String os = scanner.next();

        System.out.print("Enter Component : ");
        String com = scanner.next();

        factory = Factory.getInstance(os);

        component = factory.getComponentDetails(com);

        System.out.println(component.create());

    }
}
