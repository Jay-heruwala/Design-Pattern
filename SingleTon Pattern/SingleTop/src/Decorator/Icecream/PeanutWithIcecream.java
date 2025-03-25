package Decorator.Icecream;

public class PeanutWithIcecream extends IcecreamDecorator{

    PeanutWithIcecream(Icecream icecream) {
        super(icecream);
    }

    @Override
    public String getDescription() {
        return icecreamDecorator.getDescription()+ " with Peanut";
    }

    @Override
    public double getCost() {
        return icecreamDecorator.getCost() + 20.00;
    }
}
