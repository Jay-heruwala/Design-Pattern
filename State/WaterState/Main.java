// State interface
interface WaterState {
    String getStateName();
    void heat(Water water);
    void cool(Water water);
}

// Context class
class Water {
    private WaterState state;

    public Water() {
        this.state = new SolidState(); // Initial state
    }

    public void setState(WaterState state) {
        this.state = state;
        System.out.println("Water changed to " + state.getStateName() + " state");
    }

    public void heat() {
        state.heat(this);
    }

    public void cool() {
        state.cool(this);
    }

    public String getCurrentState() {
        return state.getStateName();
    }
}

// Concrete state: Solid
class SolidState implements WaterState {
    @Override
    public String getStateName() {
        return "Solid (Ice)";
    }

    @Override
    public void heat(Water water) {
        System.out.println("Heating ice... Melting to liquid");
        water.setState(new LiquidState());
    }

    @Override
    public void cool(Water water) {
        System.out.println("Ice is already at its coldest state");
    }
}

// Concrete state: Liquid
class LiquidState implements WaterState {
    @Override
    public String getStateName() {
        return "Liquid";
    }

    @Override
    public void heat(Water water) {
        System.out.println("Heating liquid... Evaporating to gas");
        water.setState(new GasState());
    }

    @Override
    public void cool(Water water) {
        System.out.println("Cooling liquid... Freezing to ice");
        water.setState(new SolidState());
    }
}

// Concrete state: Gas
class GasState implements WaterState {
    @Override
    public String getStateName() {
        return "Gas (Vapor)";
    }

    @Override
    public void heat(Water water) {
        System.out.println("Vapor is already at its hottest state");
    }

    @Override
    public void cool(Water water) {
        System.out.println("Cooling vapor... Condensing to liquid");
        water.setState(new LiquidState());
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        Water water = new Water();
        System.out.println("Initial state: " + water.getCurrentState());

        // Simulate state transitions
        System.out.println("\nApplying heat:");
        water.heat();

        System.out.println("\nApplying more heat:");
        water.heat();

        System.out.println("\nTrying to heat gas:");
        water.heat();

        System.out.println("\nCooling down:");
        water.cool();

        System.out.println("\nCooling further:");
        water.cool();

        System.out.println("\nTrying to cool ice:");
        water.cool();
    }
}