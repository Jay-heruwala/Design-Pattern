package Observer.YouTubeWithOutObserver;



import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel {
    List<Subscriber> subscribers = new ArrayList<>();

    public void attach(Subscriber s){
        subscribers.add(s);
    }

    public void detech(Subscriber s){
        subscribers.remove(s);
    }

    public void changeState(){
        notifyAll();
    }

    public void nofifyAll(){
        for (Subscriber s : subscribers){
            s.update("New Changes ");
        }
    }
}
