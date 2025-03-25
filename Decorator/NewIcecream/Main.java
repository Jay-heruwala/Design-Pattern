package Decorator.NewIcecream;



public class Main {
    public static void main(String[] args) {
        Icecream icecream = new VenilaIcecream();
        System.out.println(icecream.getDescription() + "   Cost is   "  + icecream.getCose());

        Icecream penut = new PenutDecorator(icecream);
        System.out.println(penut.getDescription() + "   Cost is   "  + penut.getCose());


    }
}
