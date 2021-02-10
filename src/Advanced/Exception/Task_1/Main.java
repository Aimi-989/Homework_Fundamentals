package Advanced.Exception.Task_1;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
//            int b = 3/0;
            throw new Exception("error we have here");
        } catch(Exception e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
        } finally {
            System.out.println("Finally");
        }
    }
}
