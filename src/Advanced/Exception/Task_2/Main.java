package Advanced.Exception.Task_2;

public class Main {
    private static Object MyBestException;

    public static void main(String[] args) {
        
        System.out.println(MyBestException);
        
        try {
//            int b = 3/0;
            Integer c = getInteger();
            c.byteValue();
            throw new MyBestException("Error");
        } catch(MyBestException e) {
            System.out.println(e.getText());
            //e.printStackTrace();
        } finally {
            System.out.println("Finally");
        }
    }

    public static Integer getInteger() {
        return null;
    }
}
