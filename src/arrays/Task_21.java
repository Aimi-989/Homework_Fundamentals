package arrays;

public class Task_21 {
    public static void main(String[] args) {
        int[] array = {6, 5, 4, 5, 10, 5, 8, 3, 10, 6, 6, 6, 4, 3, 2, 8, 1, 3, 5, 7};
        int count = 0;
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == temp) {
                count++;
            }
        }
        System.out.println(count);
    }
}

