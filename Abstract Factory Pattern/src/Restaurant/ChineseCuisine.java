package Restaurant;

public class ChineseCuisine extends CuisineFactory{
    @Override
    public Dessert bringDessert() {
        return new ChineseDessert();
    }

    @Override
    public Appetizer bringAppetizer() {
        return new ChineseAppetizer();
    }

    @Override
    public MainCourse bringMainCourse() {
        return new ChineseMainCourse();
    }
}
