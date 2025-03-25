package Decorator.Icecream;

public class Main {
    public static void main(String[] args) {

        Icecream icecream = new VanilaIcecream();
        Icecream i1 = new PeanutWithIcecream(icecream);
        System.out.println(i1.getDescription());
        System.out.println("Cost : " + i1.getCost());

        Icecream icecream2 = new StrawberryIcecream();
        Icecream i2 = new ChesuNutWithIcecream(icecream2);
        System.out.println(i2.getDescription());
        System.out.println("Cost : " + i2.getCost());
    }

}
