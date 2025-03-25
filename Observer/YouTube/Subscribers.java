package Observer.YouTube;

public class Subscribers implements Observer{

    String observerName;

    Subscribers(String observerName){
        this.observerName = observerName;
    }

    @Override
    public void update(String notification) {
        System.out.println("Hello " + observerName + " " + notification);
    }
}
