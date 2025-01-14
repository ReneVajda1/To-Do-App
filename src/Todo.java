public class Todo {
    private String text;
    private boolean isDone;

    public Todo(String text, boolean isDone) {
        this.text = text;
        this.isDone = isDone;
    }

    @Override
    public String toString() {
        return String.format("[%s]<%s>",isDone ? "X" : " ", text);
    }
}
