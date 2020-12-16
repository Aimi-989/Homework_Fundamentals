package arrays;

public class Task_15 {
    public static void main(String[] args) {
        int [][] array = {{3,5,6},{4,8,4},{7,9,2}};
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++)
                sum = sum + array[i][j];
            System.out.println(sum/3);

            }
        }
    }

