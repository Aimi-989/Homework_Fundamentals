package arrays;

public class Task_14 {
    public static void main(String[] args) {
        int[][] array = {{3,5,6},{4,8,5},{7,9,2}};
        int max;
        max = array[0][0];

        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
