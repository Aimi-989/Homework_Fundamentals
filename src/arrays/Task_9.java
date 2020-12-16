package arrays;

public class Task_9 {
    public static void main(String[] args) {
        int[] array = {1, 2, 7, 3, 10, 2, 9};
        int sum = 4;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == sum) {
                    System.out.print(array[i] + " - " + array[j] + ", ");
                }
            }
        }
    }
}
