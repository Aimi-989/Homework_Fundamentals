package arrays;
import java.util.Arrays;

public class Task_19 {
    public static void main(String[] args) {
        int [] array = {4,5,0,7,2,0,0,8};
        int number;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] != 0) {
                        number = array[j];
                        array[j] = array[i];
                        array[i] = number;
                    }
                }
            }
        }System.out.println(Arrays.toString(array));
    }
}
