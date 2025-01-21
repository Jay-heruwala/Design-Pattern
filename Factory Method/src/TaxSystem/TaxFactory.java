package TaxSystem;
public class TaxFactory {
    public static Tax getTaxObject(String taxType){
        Tax tax = null;
        if(taxType.equalsIgnoreCase("roadtax")){
            tax = new RoadTax();
        } else if (taxType.equalsIgnoreCase("watertax")) {
            tax = new WaterTax();
        } else if (taxType.equalsIgnoreCase("propertytax")) {
            tax = new PropertyTax();
        }else {
            throw new IllegalArgumentException();
        }


        return tax;
    }
}
