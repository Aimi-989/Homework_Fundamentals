package conditional_statements;

public class Task_5 {
    public static void main(String[] args) {

        /*
        int a = 4;
        int b = 4;
        int c = 4;

        int a = 4;
        int b = 9;
        int c = 7;
         */

        int a = -4;
        int b = -9;
        int c = -8;


        if (a == b && b == c) {
            System.out.println("All numbers are equal");
        } else if (a < b && b > c) {
            System.out.println("All numbers are different");
        } else if (a > b && b < c) {
            System.out.println("Neither all are equal of different");
        }
    }
}
