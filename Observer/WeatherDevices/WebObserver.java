package Observer.WeatherDevices;

public class WebObserver implements Observer{

    @Override
    public void update(String notification) {
        System.out.println("Msg Received on web :  " + notification);
    }
}
