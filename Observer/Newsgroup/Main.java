package Observer.Newsgroup;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer user1 = new Subscribers("Aman");
        Observer user2 = new Subscribers("Dev");
        Observer user3 = new Subscribers("Kris");

        subject.attach(user1);
        subject.attach(user2);
        subject.attach(user3);

        subject.setState("This is testing State");
    }
}
