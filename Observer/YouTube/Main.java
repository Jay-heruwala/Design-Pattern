package Observer.YouTube;

public class Main {
    public static void main(String[] args) {
        YouTubeSubject yt = new YouTubeSubject("GVP");

        Observer subscriber1 = new Subscribers("Dev");
        Observer subscriber2 = new Subscribers("Sudhir");
        Observer subscriber3 = new Subscribers("Durgesh");

        yt.attach(subscriber1);
        yt.attach(subscriber2);
        yt.attach(subscriber3);

        yt.uploadVideoOrPost("Student life at GVP.");
    }
}
