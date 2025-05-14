package Strategy.Snake;

public interface Snake {
    public String info();
    public String performBite();
    public void changeStrategy(BiteStrategy biteStrategy);
}
