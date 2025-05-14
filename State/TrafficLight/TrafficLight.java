package State.TrafficLight;

public class TrafficLight {
    State trafficState;

    TrafficLight(){
        this.trafficState = new GreenLight();
    }

    public void setState(State state){
        this.trafficState = state;
    }

    public void changeState(){
        trafficState.handle(this);
    }

}
