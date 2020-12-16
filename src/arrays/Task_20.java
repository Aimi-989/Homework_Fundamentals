package arrays;

public class Task_20 {
    public static void main(String[] args) {

        int[][] array = {{1,2,3},{4,5,6}};

        for (int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(j < array[i].length/2)
                    array[i][array[i].length-1] = array[i][j];
            }
        }
    }
}
