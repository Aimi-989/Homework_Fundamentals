package loops;

public class Task_1_2 {
    public static void main(String[] args) {
        System.out.println("Task 1");
        for (int i = 2; i <= 100; i = i+2){
            System.out.print(i);
            if (i != 100){
                System.out.print(",");
            }

        }
        System.out.println();
        System.out.println();
        System.out.println("Task 2");
        for (int j = 1; j <= 99; j = j+2){
            System.out.print(j);
            if (j != 99) {
                System.out.print(",");
            }
        }
    }
}
