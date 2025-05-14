package State.TrafficLight;

public class RedLight implements State {

    @Override
    public void handle(TrafficLight trafficLight) {
        System.out.println("Red Light - Stop");
        trafficLight.setState(new GreenLight());
    }
}
