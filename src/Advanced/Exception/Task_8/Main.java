package Advanced.Exception.Task_8;

public class Main {

    public static void main(String[] args) {

        int someException = 10;

        while (someException > -3) {
            Number result = 1 / someException;

            System.out.println("Result is: " + result.doubleValue() + "; current value of divisor: " + someException);
            someException = someException - 1;
        }
    }
}
