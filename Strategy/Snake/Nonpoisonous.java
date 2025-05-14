package Strategy.Snake;

public class Nonpoisonous implements BiteStrategy{
    @Override
    public String bite() {
        return " has a non poisonous bite";
    }
}
