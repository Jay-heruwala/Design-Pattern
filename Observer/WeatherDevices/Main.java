package Observer.WeatherDevices;

public class Main {
    public static void main(String[] args) {

        Observer device1 = new PhoneObserver();
        Observer device2 = new WebObserver();

        WeatherStation ws = new WeatherStation();

        ws.attach(device1);
        ws.attach(device2);

        ws.setMsg("This is a Notification for the security reason");


    }
}
