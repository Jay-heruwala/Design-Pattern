package ChainOfResponsibility.ATM;

// 1. Abstract Handler
abstract class MoneyDispenser {
    protected MoneyDispenser nextDispenser;

    public void setNext(MoneyDispenser nextDispenser) {
        this.nextDispenser = nextDispenser;
    }

    public abstract void dispense(WithdrawalRequest request);
}

// 2. Request Class
class WithdrawalRequest {
    private int amount;

    public WithdrawalRequest(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

// 3. Concrete Handler 1: FiftyDispenser
class FiftyDispenser extends MoneyDispenser {
    private static final int DENOMINATION = 50;

    @Override
    public void dispense(WithdrawalRequest request) {
        if (request.getAmount() >= DENOMINATION) {
            int numNotes = request.getAmount() / DENOMINATION;
            int remainder = request.getAmount() % DENOMINATION;
            System.out.println("Dispensing " + numNotes + " $50 note(s)");
            if (remainder > 0 && nextDispenser != null) {
                request.setAmount(remainder);
                nextDispenser.dispense(request);
            }
        } else if (nextDispenser != null) {
            nextDispenser.dispense(request);
        } else if (request.getAmount() > 0) {
            System.out.println("Cannot dispense $" + request.getAmount() + " with available denominations");
        }
    }
}

// 4. Concrete Handler 2: TwentyDispenser
class TwentyDispenser extends MoneyDispenser {
    private static final int DENOMINATION = 20;

    @Override
    public void dispense(WithdrawalRequest request) {
        if (request.getAmount() >= DENOMINATION) {
            int numNotes = request.getAmount() / DENOMINATION;
            int remainder = request.getAmount() % DENOMINATION;
            System.out.println("Dispensing " + numNotes + " $20 note(s)");
            if (remainder > 0 && nextDispenser != null) {
                request.setAmount(remainder);
                nextDispenser.dispense(request);
            }
        } else if (nextDispenser != null) {
            nextDispenser.dispense(request);
        } else if (request.getAmount() > 0) {
            System.out.println("Cannot dispense $" + request.getAmount() + " with available denominations");
        }
    }
}

// 5. Concrete Handler 3: TenDispenser
class TenDispenser extends MoneyDispenser {
    private static final int DENOMINATION = 10;

    @Override
    public void dispense(WithdrawalRequest request) {
        if (request.getAmount() >= DENOMINATION) {
            int numNotes = request.getAmount() / DENOMINATION;
            int remainder = request.getAmount() % DENOMINATION;
            System.out.println("Dispensing " + numNotes + " $10 note(s)");
            if (remainder > 0 && nextDispenser != null) {
                request.setAmount(remainder);
                nextDispenser.dispense(request);
            }
        } else if (nextDispenser != null) {
            nextDispenser.dispense(request);
        } else if (request.getAmount() > 0) {
            System.out.println("Cannot dispense $" + request.getAmount() + " with available denominations");
        }
    }
}

// 6. ATM Class (Client)
class ATM {
    private MoneyDispenser chain;

    public ATM() {
        // Set up the chain: $50 -> $20 -> $10
        MoneyDispenser fiftyDispenser = new FiftyDispenser();
        MoneyDispenser twentyDispenser = new TwentyDispenser();
        MoneyDispenser tenDispenser = new TenDispenser();

        fiftyDispenser.setNext(twentyDispenser);
        twentyDispenser.setNext(tenDispenser);
        this.chain = fiftyDispenser;
    }

    public void withdraw(int amount) {
        if (amount % 10 != 0) {
            System.out.println("Amount must be in multiples of $10. Cannot process $" + amount);
            return;
        }
        System.out.println("Processing withdrawal request for $" + amount);
        WithdrawalRequest request = new WithdrawalRequest(amount);
        chain.dispense(request);
        System.out.println("Withdrawal completed\n---");
    }
}

// 7. Demo Usage
public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();

        atm.withdraw(130); // $50 x 2, $20 x 1, $10 x 1
        atm.withdraw(70);  // $50 x 1, $20 x 1
        atm.withdraw(25);  // Invalid amount (not multiple of 10)
        atm.withdraw(90);  // $50 x 1, $20 x 2
    }
}
