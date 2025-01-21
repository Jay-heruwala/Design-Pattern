package TaxSystem;
public class Vadodara extends City{
    @Override
    String TaxGenerator(Tax tax) {
        return "Vadodara : " + tax.calculateTax();
    }
}