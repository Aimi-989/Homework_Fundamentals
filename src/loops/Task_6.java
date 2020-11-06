package loops;

public class Task_6 {
    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.print("Divided by 3: " + i + " ");

            } if (i % 5 == 0) {
                System.out.println("Divided by 5: " + i + " ");

            } if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Divided by 3 and 5: " + i + " ");
            }
        }
    }
}





