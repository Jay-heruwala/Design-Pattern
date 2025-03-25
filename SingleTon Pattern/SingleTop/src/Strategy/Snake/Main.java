package Strategy.Snake;

public class Main {
    public static void main(String[] args) {
        Snake cobra = new Snake("Cobra", true);
        Snake pythonSnake = new Snake("Python", false);

        PoisonStrategy poisonToUnpoisonStrategy = new PoisonToUnpoisonStrategy();
        PoisonStrategy unpoisonToPoisonStrategy = new UnpoisonToPoisonStrategy();

        System.out.println(cobra.setPoisonStrategy(poisonToUnpoisonStrategy));
    }
}
