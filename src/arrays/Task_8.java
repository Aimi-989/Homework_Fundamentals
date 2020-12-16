package arrays;

import java.util.Arrays;

public class Task_8 {
    public static void main(String[] args) {
        int[] array = {1, 7, 3, 10, 9};

        Arrays.sort(array);
        System.out.println(array[array.length - 2]);
    }
}
        /*int secondElement;

        for (int i = 1; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] > array[j]){
                    secondElement = array[i];
                    array[i] = array[j];
                    array[j] = secondElement;
                }
            }
        }
        System.out.println(array[array.length - 2]);
    }
}*/
