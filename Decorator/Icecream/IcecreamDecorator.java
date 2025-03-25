package Decorator.Icecream;

public abstract class IcecreamDecorator implements Icecream {
    protected Icecream icecreamDecorator;

    IcecreamDecorator(Icecream icecream){
        this.icecreamDecorator = icecream;
    }
}
