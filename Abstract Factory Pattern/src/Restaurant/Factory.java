package Restaurant;



public abstract class Factory {
    public abstract Appetizer getAppetizer();
    public abstract Dessert getDessert();
    public abstract MainCourse getMainCourse();


    public static Factory getInstance(String os){


        return switch (os.toLowerCase()){
            case "india" -> new IndianFactory();
            case "chinese" -> new ChineseFactory();
            default -> throw new IllegalArgumentException();
        };
    }

    public static String componentReturn(Factory factory, String componentName){
        if(componentName.equalsIgnoreCase("Dessert")){
            Appetizer appetizer = factory.getAppetizer();
            return appetizer.getAppetizer();
        } else if (componentName.equalsIgnoreCase("MainCourse")) {
            Dessert dessert = factory.getDessert();
            return dessert.getDessert();
        }else if(componentName.equalsIgnoreCase("Appetizer")){
            MainCourse mainCourse = factory.getMainCourse();
            return mainCourse.getMainCourse();
        }else{
            throw new IllegalArgumentException();
        }
    }
}
