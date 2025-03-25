package State.TodoCompletion;

// State interface defining behavior for the To-Do item
interface TodoState {
    void markCompleted(TodoItem todo);
    void markNotCompleted(TodoItem todo);
    String getStatus();
}