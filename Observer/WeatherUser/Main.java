package Observer.WeatherUser;

public class Main {
    public static void main(String[] args) {
        ObserverUser user1 = new ObserverUser("Jay");
        ObserverUser user2 = new ObserverUser("Aman");
        ObserverUser user3 = new ObserverUser("Dev");

        Subject s = new WeatherStation();
        s.attach(user1);
        s.attach(user2);
        s.attach(user3);

        s.notifyUser(10.00f);
    }
}
