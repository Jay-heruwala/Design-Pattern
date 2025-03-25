package State.TodoCompletion;

// State when the To-Do item is completed
class CompletedState implements TodoState {
    @Override
    public void markCompleted(TodoItem todo) {
        System.out.println("To-Do is already completed!");
    }

    @Override
    public void markNotCompleted(TodoItem todo) {
        System.out.println("Marking To-Do as not completed.");
        todo.setState(new NotCompletedState()); // Transition to NotCompleted
    }

    @Override
    public String getStatus() {
        return "Completed";
    }
}
