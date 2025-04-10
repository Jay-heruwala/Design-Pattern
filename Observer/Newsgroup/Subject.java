package Observer.Newsgroup;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    String msg;
    List<Observer> subscriber = new ArrayList<>();

    public void attach(Observer o) {
        if(!subscriber.contains(o)){
            subscriber.add(o);
        }else{
            System.out.println("You Already subscribed");
        }
    }

    public void detech(Observer o) {
        if(!subscriber.contains(o)){
            System.out.println("You Already not subscriber");
        }else{
            subscriber.remove(o);
        }
    }

    public void setState(String msg){
        this.msg = msg;
        notifys();
    }

    private void notifys(){
        for (Observer o : subscriber){
            o.update(msg);
        }
    }
}
