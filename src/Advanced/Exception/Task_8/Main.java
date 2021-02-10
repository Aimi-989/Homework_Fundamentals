package Advanced.Exception.Task_8;

public class Main {

    public void ExceptionInLoop() {

        int SomeException = 1;

        while (SomeException < 1) {
            try {
                System.out.println("Error");

        } catch (Exception e) {
                System.out.println("Checked");
            }
        }
    }
}

