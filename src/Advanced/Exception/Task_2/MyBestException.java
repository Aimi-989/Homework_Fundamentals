package Advanced.Exception.Task_2;

public class MyBestException extends Exception {
    private String text;

    public MyBestException(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
