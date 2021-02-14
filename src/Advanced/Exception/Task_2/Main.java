package Advanced.Exception.Task_2;

public class Main {
    public static void main(String[] args) {

        //int b = 3/0;
        Integer c = null;
        try {
            c = getInteger();
        } catch (MyBestException e) {
            System.out.println(e.getText());
            System.exit(1);
        }
        c.byteValue();
    }

    public static Integer getInteger() throws MyBestException {
        throw new MyBestException("Text");
    }
}