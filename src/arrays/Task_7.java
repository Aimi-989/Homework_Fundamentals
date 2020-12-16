package arrays;

public class Task_7 {
    public static void main(String[] args) {
        int[] array = {1, 7, 3, 7, 10, 1, 9};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == (array[j]) && (i != j)) {
                    System.out.print(array[j] + ", ");
                }
            }
        }
    }
}

