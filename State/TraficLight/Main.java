package State.TraficLight;

// 1. State Interface
interface TrafficLightState {
    void handle(TrafficLight context);
    String getColor();
}

// 2. Context: TrafficLight
class TrafficLight {
    private TrafficLightState state;

    public TrafficLight() {
        this.state = new RedState(); // Initial state
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void change() {
        state.handle(this);
    }

    public String getCurrentColor() {
        return state.getColor();
    }
}

// 3. Concrete State 1: RedState
class RedState implements TrafficLightState {
    @Override
    public void handle(TrafficLight context) {
        System.out.println("Red Light - Stop!");
        context.setState(new GreenState()); // Transition to Green
    }

    @Override
    public String getColor() {
        return "Red";
    }
}

// 4. Concrete State 2: GreenState
class GreenState implements TrafficLightState {
    @Override
    public void handle(TrafficLight context) {
        System.out.println("Green Light - Go!");
        context.setState(new YellowState()); // Transition to Yellow
    }

    @Override
    public String getColor() {
        return "Green";
    }
}

// 5. Concrete State 3: YellowState
class YellowState implements TrafficLightState {
    @Override
    public void handle(TrafficLight context) {
        System.out.println("Yellow Light - Prepare to Stop!");
        context.setState(new RedState()); // Transition to Red
    }

    @Override
    public String getColor() {
        return "Yellow";
    }
}

// 6. Demo Usage
public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        System.out.println("Current state: " + trafficLight.getCurrentColor());
        trafficLight.change(); // Red -> Green
        System.out.println("Current state: " + trafficLight.getCurrentColor());
        trafficLight.change(); // Green -> Yellow
        System.out.println("Current state: " + trafficLight.getCurrentColor());
        trafficLight.change(); // Yellow -> Red
        System.out.println("Current state: " + trafficLight.getCurrentColor());
    }
}
