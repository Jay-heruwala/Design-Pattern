package State;

// Abstract Handler class
abstract class ExpenseHandler {
    protected ExpenseHandler successor;

    public void setSuccessor(ExpenseHandler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(double amount);
}

// Concrete Handler: Manager
class Manager extends ExpenseHandler {
    @Override
    public void handleRequest(double amount) {
        if (amount <= 1000) {
            System.out.println("Manager approves " + amount);
        } else if (successor != null) {
            successor.handleRequest(amount);
        } else {
            System.out.println("No one can approve " + amount);
        }
    }
}

// Concrete Handler: Director
class Director extends ExpenseHandler {
    @Override
    public void handleRequest(double amount) {
        if (amount <= 10000) {
            System.out.println("Director approves " + amount);
        } else if (successor != null) {
            successor.handleRequest(amount);
        } else {
            System.out.println("No one can approve " + amount);
        }
    }
}

// Concrete Handler: CEO
class CEO extends ExpenseHandler {
    @Override
    public void handleRequest(double amount) {
        if (amount <= 100000) {
            System.out.println("CEO approves " + amount);
        } else {
            System.out.println("Request for " + amount + " rejected");
        }
    }
}

// Main class to test the chain
public class Main {
    public static void main(String[] args) {
        // Set up the chain: Manager -> Director -> CEO
        ExpenseHandler manager = new Manager();
        ExpenseHandler director = new Director();
        ExpenseHandler ceo = new CEO();

        manager.setSuccessor(director);
        director.setSuccessor(ceo);

        // Test different request amounts
        manager.handleRequest(500);      // Manager approves $500.0
        manager.handleRequest(5000);     // Director approves $5000.0
        manager.handleRequest(50000);    // CEO approves $50000.0
        manager.handleRequest(200000);   // Request for $200000.0 rejected
    }
}
