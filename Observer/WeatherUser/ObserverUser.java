package Observer.WeatherUser;

public class ObserverUser implements Observer {
    public String user;

    ObserverUser(String user){
        this.user = user;
    }

    @Override
    public void update(float temperature) {
        System.out.println(user + " temperature : " + temperature);
    }
}
