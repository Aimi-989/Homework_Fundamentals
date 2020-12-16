package arrays;

public class Tasks_1_2_3 {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int[] array = {1, 7, 3, 10, 9};
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum = sum + array[i];
        System.out.println(sum);
        System.out.println();

        System.out.println("Task 2");
        int[] array1 = {1, 7, 3, 10, 9};
        int sum1 = 0;
        for (int i = 0; i < array1.length; i++)
            sum1 = sum1 + array1[i];
        System.out.println(sum1 / 5);
        System.out.println();

        System.out.println("Task 3");
        int[] array2 = {1, 7, 3, 10, 9};
        for (int i = 0; i < array2.length; i = i + 1) {
            if (array2[i] % 2 != 0) {
                System.out.print(array2[i] + ", ");
            }
        }
    }
}


