package TaxSystem;
public class Surat extends City{
    @Override
    String TaxGenerator(Tax tax) {
        return "Surat : " + tax.calculateTax();
    }
}