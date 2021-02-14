package Advanced.Exception.Task_3;

import java.io.IOException;

public class ExceptionEx {

    //exception declared to be handled later (on next call?)
    public void exceptionToBeThrownLater() throws IOException {
        throw new IOException();
    }

    public void usePreviousMethod() throws IOException {
        exceptionToBeThrownLater();
    }
}
