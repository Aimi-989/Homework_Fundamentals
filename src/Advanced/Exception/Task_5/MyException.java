package Advanced.Exception.Task_5;

import Advanced.Exception.Task_2.MyBestException;

public class MyException {
    public void f(){
        try {
            g();
        } catch (MyBestException e) {
            //throw new Exception("lll");
        }
    };
    public void g() throws MyBestException {
    };
}
