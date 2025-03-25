package Decorator.Icecream;

public class VanilaIcecream implements Icecream{
    @Override
    public String getDescription() {
        return "This is Vanilla Ice cream";
    }

    @Override
    public double getCost() {
        return 40.00;
    }
}
