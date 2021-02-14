package Advanced.Exception.Task_5;

import Advanced.Exception.Task_2.MyBestException;

    public class ClassTwoMethods {
        public void f() {
            try {
                g();
            } catch (MyBestException e) {
                throw new NullPointerException();
            }

        }

        public void g() throws MyBestException {
            throw new MyBestException("thrown cause it was needed");
        }


    }


