package State.TodoCompletion;

// Context class representing the To-Do item
class TodoItem {
    private TodoState state;
    private String description;

    public TodoItem(String description) {
        this.description = description;
        this.state = new NotCompletedState(); // Initial state
    }

    public void setState(TodoState state) {
        this.state = state;
    }

    public void markCompleted() {
        state.markCompleted(this);
    }

    public void markNotCompleted() {
        state.markNotCompleted(this);
    }

    public String getStatus() {
        return state.getStatus();
    }

    public String getDescription() {
        return description;
    }
}
