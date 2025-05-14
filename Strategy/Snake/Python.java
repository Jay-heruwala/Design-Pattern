package Strategy.Snake;

public class Python implements Snake{

    BiteStrategy biteStrategy;

    Python(){
        this.biteStrategy = new PoisonousBite();
    }

    @Override
    public String info() {
        return "Python";
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
