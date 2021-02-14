package Advanced.Exception.Task_7;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        try {
            throwAllThree();
        }
        catch( AException | BException | CException e) {
            System.out.println("Error");
        }
    }

    public static void throwAllThree() throws AException, BException, CException {
        //some peculiar logic here
    }
}