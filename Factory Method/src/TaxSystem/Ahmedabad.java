
package TaxSystem;
public class Ahmedabad extends City{
    @Override
    String TaxGenerator(Tax tax) {
        return "Ahmedabad : " + tax.calculateTax();
    }
}
