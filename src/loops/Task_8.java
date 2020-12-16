package loops;

import java.sql.SQLOutput;

public class Task_8 {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 1;

        System.out.print(num1 + " " + num2 + " ");

        int result = num1 + num2;
        //while (result < 34) {
        {
            for (int i=2; i <= 10; i++ ){
            num1 = num2;            //sum = previous;
            num2 = result;          //previous = next;
            result = num1 + num2;   //next = sum + previous;
            System.out.print(result + " ");

        }
    }
}

    }
