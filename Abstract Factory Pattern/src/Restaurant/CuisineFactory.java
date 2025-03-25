package Restaurant;


abstract public class CuisineFactory {
    public abstract Dessert bringDessert();
    public abstract Appetizer bringAppetizer();
    public abstract MainCourse bringMainCourse();


    public static CuisineFactory getInstance(String country){
        if(country.equalsIgnoreCase("india")){
            return new IndianCuisine();
        } else if (country.equalsIgnoreCase("chinese")) {
            return new ChineseCuisine();
        }else{
            throw new IllegalArgumentException();
        }
    }


}
