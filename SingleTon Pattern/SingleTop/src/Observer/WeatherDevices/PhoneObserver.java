package Observer.WeatherDevices;

public class PhoneObserver implements Observer{

    @Override
    public void update(String notification) {
        System.out.println("Msg Received on phone :  " + notification);
    }
}
