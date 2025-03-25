package NewComponents;

import java.util.Scanner;

public class ClientCode {
    public static void main(String[] args) {
        Factory factory = null;
        String result;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Os :");
        String os = scanner.next();

        System.out.print("Enter the component : ");
        String componentName = scanner.next();


        String componentResult = Factory.componentReturn(Factory.getInstance(os),componentName);
        System.out.println(componentResult);
    }
}
