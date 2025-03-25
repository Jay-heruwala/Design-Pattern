package State.VendingMachine;

// State interface
interface VendingMachineState {
    void insertCoin(VendingMachine machine);
    void dispenseItem(VendingMachine machine);
}

// Concrete State: NoCoin
class NoCoinState implements VendingMachineState {
    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Coin inserted.");
        machine.setState(new HasCoinState()); // Transition to HasCoin
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Insert a coin first!");
    }
}

// Concrete State: HasCoin
class HasCoinState implements VendingMachineState {
    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Coin already inserted!");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Dispensing item...");
        machine.setState(new NoCoinState()); // Transition back to NoCoin
    }
}

// Context: VendingMachine
class VendingMachine {
    private VendingMachineState state;

    public VendingMachine() {
        this.state = new NoCoinState(); // Initial state
    }

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public void insertCoin() {
        state.insertCoin(this);
    }

    public void dispenseItem() {
        state.dispenseItem(this);
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        machine.dispenseItem(); // Output: "Insert a coin first!"
        machine.insertCoin();   // Output: "Coin inserted."
        machine.dispenseItem(); // Output: "Dispensing item..."
        machine.dispenseItem(); // Output: "Insert a coin first!"
    }
}