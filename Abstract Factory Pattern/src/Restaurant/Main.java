package Restaurant;

import NewComponents.Factory;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        NewComponents.Factory factory = null;
        String result;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Country :");
        String os = scanner.next();

        System.out.print("Enter the item : ");
        String componentName = scanner.next();


        String componentResult = NewComponents.Factory.componentReturn(Factory.getInstance(os),componentName);
        System.out.println(componentResult);
    }
}
