package Decorator.Icecream;

public class StrawberryIcecream implements Icecream{
    @Override
    public String getDescription() {
        return "This is strawberry Ice cream";
    }

    @Override
    public double getCost() {
        return 50.00;
    }
}
