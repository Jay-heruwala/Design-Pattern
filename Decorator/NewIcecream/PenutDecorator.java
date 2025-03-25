package Decorator.NewIcecream;

public class PenutDecorator extends DecoratorComponent{

    PenutDecorator(Icecream icecream){
        super(icecream);
    }

    @Override
    public String getDescription() {
        return this.icecream.getDescription() + " with peanut";
    }

    @Override
    public double getCose() {
        return this.icecream.getCose() + 50;
    }
}
