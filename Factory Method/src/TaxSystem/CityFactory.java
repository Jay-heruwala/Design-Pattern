package TaxSystem;
public class CityFactory {
    public static City getCityObject(String cityName){
        City city = null;

        if(cityName.equalsIgnoreCase("ahmedabad")){
            city = new Ahmedabad();
        }else if(cityName.equalsIgnoreCase("vadodara")){
            city = new Vadodara();
        }else if(cityName.equalsIgnoreCase("surat")){
            city = new Surat();
        }else{
            throw new IllegalArgumentException();
        }

        return city;
    }
}
