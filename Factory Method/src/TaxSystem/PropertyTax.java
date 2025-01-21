package TaxSystem;
public class PropertyTax implements Tax{
    @Override
    public double calculateTax() {
        return 1000.00;
    }
}
