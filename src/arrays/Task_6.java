package arrays;


public class Task_6 {
    public static void main(String[] args) {
        int[] array = {1, 7, 3, 10, 9};
        int min, max;
        min = max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
            if (array[i] > max){
                max = array[i];
            }

        }
              System.out.println("Min = " + min + "; Max = " + max);

    }

    }



