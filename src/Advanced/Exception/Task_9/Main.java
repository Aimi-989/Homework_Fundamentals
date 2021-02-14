package Advanced.Exception.Task_9;

public class Main {
    public static void main(String[] args) {
        Lower low = new Lower();
        try {
            ((God) low).throwLowerException();
        } catch (GodException e) {
            e.printStackTrace();
        }
    }
}

