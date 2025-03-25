package Decorator.Icecream;

public class ChesuNutWithIcecream extends IcecreamDecorator {

    ChesuNutWithIcecream(Icecream icecream){
        super(icecream);
    }

    @Override
    public String getDescription() {
        return icecreamDecorator.getDescription() + " With chesu nuts";
    }

    @Override
    public double getCost() {
        return icecreamDecorator.getCost() + 30.00;
    }
}
