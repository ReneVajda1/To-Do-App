public class Todo {
    private String text;
    private boolean isDone;

    public Todo(String text, boolean isDone) {
        this.text = text;
        this.isDone = isDone;
    }
    // toggle() if used switches between true and false
    public void toggle() {
        this.isDone = !this.isDone;
    }

  // todo can be created now from the text
    public static Todo fromString(String from){
        char isDoneIndicator = from.charAt(1);
        boolean isDone = isDoneIndicator == 'X';
        String text = from.substring(5,from.length()-1);
        return new Todo(text,isDone);
    }

    public boolean isDone() {
        return isDone;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return String.format("[%s] <%s>",isDone ? "X" : " ", text);
    }


}
