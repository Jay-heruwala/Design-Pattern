package Restaurant;

public class IndianCuisine extends CuisineFactory{
    @Override
    public Dessert bringDessert() {
        return new IndianDessert();
    }

    @Override
    public Appetizer bringAppetizer() {
        return new IndianAppetizer();
    }

    @Override
    public MainCourse bringMainCourse() {
        return new IndianMainCourse();
    }
}
