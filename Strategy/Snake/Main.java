package Strategy.Snake;

public class Main {
    public static void main(String[] args) {
        Snake snake = new Python();

        System.out.println(snake.performBite());
        snake.changeStrategy(new Nonpoisonous());
        System.out.println(snake.performBite());

        snake = new Cobra();
        System.out.println(snake.performBite());
        snake.changeStrategy(new PoisonousBite());
        System.out.println(snake.performBite());


    }
}
