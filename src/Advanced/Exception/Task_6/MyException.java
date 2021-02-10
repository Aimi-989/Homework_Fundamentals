package Advanced.Exception.Task_6;


    public class MyException {
        public void f(){
                throw new RuntimeException("Unchecked");
            }

        public void g() throws RuntimeException {
            throw new RuntimeException("Checked");
        }
    }

