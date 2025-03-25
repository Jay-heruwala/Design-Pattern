package Observer.YouTube;

public class YouTubeSubject extends Subject {
    private String notification;
    private String channelName;

    YouTubeSubject(String channelName){
        this.channelName = channelName;
    }

    public void uploadVideoOrPost(String uploadNewVideo){
        this.notification = this.channelName + " Upload a new Video/Post : " + uploadNewVideo;

        notifyToObservers();
    }


    @Override
    void attach(Observer o) {
        observers.add(o);
    }

    @Override
    void detech(Observer o) {

        observers.remove(o);
    }

    @Override
    void notifyToObservers() {
        for(Observer o : observers){
            o.update(this.notification);
        }
    }
}
