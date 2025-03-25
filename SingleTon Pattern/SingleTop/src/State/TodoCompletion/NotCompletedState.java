package State.TodoCompletion;

// State when the To-Do item is not completed
class NotCompletedState implements TodoState {
    @Override
    public void markCompleted(TodoItem todo) {
        System.out.println("Marking To-Do as completed.");
        todo.setState(new CompletedState()); // Transition to Completed
    }

    @Override
    public void markNotCompleted(TodoItem todo) {
        System.out.println("To-Do is already not completed!");
    }

    @Override
    public String getStatus() {
        return "Not Completed";
    }
}
