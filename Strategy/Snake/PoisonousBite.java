package Strategy.Snake;

public class PoisonousBite implements BiteStrategy{

    @Override
    public String bite() {
        return " has a poisonous bite";
    }
}
