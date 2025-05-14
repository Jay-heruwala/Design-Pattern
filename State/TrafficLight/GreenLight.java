package State.TrafficLight;

public class GreenLight implements State{
//    TrafficLight trafficLight;
    @Override
    public void handle(TrafficLight trafficLight) {
        System.out.println("Green Light - You can go");
        trafficLight.setState(new YellowLight());
    }
}
