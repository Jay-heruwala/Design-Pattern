package State.TrafficLight;

public class YellowLight implements State{
//    TrafficLight trafficLight;
    @Override
    public void handle(TrafficLight trafficLight) {
        System.out.println("Yellow Light - Ready to Stop");
        trafficLight.setState(new RedLight());
    }
}
