package State.TodoCompletion;

// Main class to test the To-Do item
public class Main {
    public static void main(String[] args) {
        TodoItem todo = new TodoItem("Finish writing State pattern example");

        // Initial state: Not Completed
        System.out.println("To-Do: " + todo.getDescription());
        System.out.println("Status: " + todo.getStatus());

        // Mark as completed
        todo.markCompleted();
        System.out.println("Status: " + todo.getStatus());

        // Try marking completed again
        todo.markCompleted();

        // Mark as not completed
        todo.markNotCompleted();
        System.out.println("Status: " + todo.getStatus());

        // Try marking not completed again
        todo.markNotCompleted();
    }
}
