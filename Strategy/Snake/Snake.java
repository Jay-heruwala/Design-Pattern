package Strategy.Snake;

public class Snake {
    String species;
    boolean isPoisonite;
    PoisonStrategy poisonStrategy;

    Snake(String species, boolean isPoisonite){
        this.species = species;
        this.isPoisonite = isPoisonite;
    }

    String setPoisonStrategy(PoisonStrategy poisonStrategy){
        this.poisonStrategy = poisonStrategy;
        return "Strategy Changed";
    }

}
