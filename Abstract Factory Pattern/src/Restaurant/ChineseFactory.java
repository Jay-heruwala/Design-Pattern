package Restaurant;

public class ChineseFactory extends Factory{
    @Override
    public Appetizer getAppetizer() {
        return new ChineseAppetizer();
    }

    @Override
    public Dessert getDessert() {
        return new ChineseDessert();
    }

    @Override
    public MainCourse getMainCourse() {
        return new ChineseMainCourse();
    }
}
