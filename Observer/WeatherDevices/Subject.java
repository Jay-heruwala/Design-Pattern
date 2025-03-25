package Observer.WeatherDevices;
import java.util.List;
import java.util.ArrayList;

public abstract class Subject {

    List<Observer> observers = new ArrayList<>();

    abstract void attach(Observer o);
    abstract void detach(Observer o);
    abstract void notifyDevices();


}
