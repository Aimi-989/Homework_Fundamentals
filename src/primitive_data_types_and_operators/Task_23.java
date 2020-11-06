package primitive_data_types_and_operators;

import java.util.Random;

public class Task_23 {
    public static void main(String[] args) {

        Random random = new Random();
        int x = random.nextInt(6) + 1;
        int y = random.nextInt(6) + 1;
        int sum = x + y;
        System.out.println("First dice = " + x);
        System.out.println("Second dice = " + y);
        System.out.println("Sum = " + sum);
    }
}
