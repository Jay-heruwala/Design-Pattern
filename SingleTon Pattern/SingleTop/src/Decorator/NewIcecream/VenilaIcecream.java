package Decorator.NewIcecream;

public class VenilaIcecream implements Icecream{
    @Override
    public String getDescription() {
        return "This is Vanila Icecream";
    }

    @Override
    public double getCose() {
        return 100.00;
    }
}
