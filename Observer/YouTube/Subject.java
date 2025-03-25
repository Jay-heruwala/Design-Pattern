package Observer.YouTube;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    List<Observer> observers = new ArrayList<>();
    abstract void attach(Observer o);
    abstract void detech(Observer o);
    abstract void notifyToObservers();

}
