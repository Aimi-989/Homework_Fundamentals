package arrays;

public class Task_13 {
    public static void main(String[] args) {
        int[][] array = {{1, 1, 1, 1}, {1, 1, 1, 1}};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                sum = sum + array[i][j];
            }
        }
        System.out.println(sum);
    }

}
