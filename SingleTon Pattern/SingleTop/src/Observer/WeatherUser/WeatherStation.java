package Observer.WeatherUser;

public class WeatherStation extends Subject{

    float temperature;

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyUser(temperature);
    }

    public float getTemperature(){
        return temperature;
    }

    @Override
    void attach(Observer o) {
        observers.add(o);
    }

    @Override
    void detach(Observer o) {
        observers.remove(o);
    }
}
