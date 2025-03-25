package Decorator.NewIcecream;

public abstract class DecoratorComponent implements Icecream{
    Icecream icecream;
    DecoratorComponent(Icecream icecream){
        this.icecream = icecream;
    }
}
