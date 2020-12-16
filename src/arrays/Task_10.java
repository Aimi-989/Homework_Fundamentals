package arrays;

import java.util.Arrays;

public class Task_10 {
    public static void main(String[] args) {
        int[] array = {1, 7, 3, 10, 9};
        int position = 2;
        int newNumber = 4;

        for (int i = array.length; i > position; i++);

        array[position] = newNumber;

        System.out.println(Arrays.toString(array));
    }
}

