package Strategy.Snake;

public class Cobra implements Snake{

    BiteStrategy biteStrategy;

    Cobra(){
        this.biteStrategy = new Nonpoisonous();
    }

    @Override
    public String info() {
        return "Cobra";
    }

    @Override
    public String performBite() {
        return this.info() + this.biteStrategy.bite();
    }

    @Override
    public void changeStrategy(BiteStrategy biteStrategy) {
        this.biteStrategy = biteStrategy;
    }
}
