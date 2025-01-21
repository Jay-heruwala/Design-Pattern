
package TaxSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        City city;
        Tax tax;

        System.out.print("Enter City Name [ahmedabad,vadodara,surat] : ");
        String cityName = scanner.next();

        city = CityFactory.getCityObject(cityName);

        System.out.print("Enter Tax Name [roadtax,propertytax,watertax] : ");
        String taxName = scanner.next();
        tax = TaxFactory.getTaxObject(taxName);

        String taxValue = city.TaxGenerator(tax);
        System.out.println(taxValue);

    }
}