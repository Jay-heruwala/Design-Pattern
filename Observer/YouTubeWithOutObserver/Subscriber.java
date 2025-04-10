package Observer.YouTubeWithOutObserver;


import Observer.YouTube.Subscribers;

public class Subscriber {
    public String name;

    Subscriber(String name){
        this.name =name;
    }

    public void update(String notificationMSG){
        System.out.println("Hello " + this.name + " : " + notificationMSG);
    }

}
