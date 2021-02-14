package Advanced.Exception;

import java.io.IOException;

public class ExceptionRules {

        //exception is caught in try-catch block
        public void exceptionInMethod() {
            String filePath = "C:/doc.txt";

//            String content = null;
//            try {
//                content = Files.readString(Paths.get(filePath));
//            } catch (IOException e) {
//                e.printStackTrace();
//            }

        }

        //exception declared to be handled later (on next call?)
        public void exceptionToBeThrownLater() throws IOException {
            throw new IOException();
        }

        public void usePreviousMethod() throws IOException {
            exceptionToBeThrownLater();
        }

//-------------------------------------------------------------

        public class TestFire {
            public void testFire() {
                ExceptionRules er = new ExceptionRules();
                try {
                    er.usePreviousMethod();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



    }


