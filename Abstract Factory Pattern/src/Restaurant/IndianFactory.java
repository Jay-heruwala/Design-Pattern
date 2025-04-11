package Restaurant;

public class IndianFactory extends Factory{
    @Override
    public Appetizer getAppetizer() {
        return new IndianAppetizer();
    }

    @Override
    public Dessert getDessert() {
        return new IndianDessert();
    }

    @Override
    public MainCourse getMainCourse() {
        return new IndianMainCourse();
    }
}
