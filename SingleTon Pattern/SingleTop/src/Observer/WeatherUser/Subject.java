package Observer.WeatherUser;
import java.util.List;
import java.util.ArrayList;

public abstract class Subject {
    List<Observer> observers = new ArrayList<>();
    abstract void attach(Observer o);
    abstract void detach(Observer o);

    void notifyUser(float temperature){
        for(Observer o : observers){
            o.update(temperature);
        }
    }
}


