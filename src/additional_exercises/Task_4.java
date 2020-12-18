package additional_exercises;

public class Task_4 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                String string = String.format("%4s", (i*j));
                System.out.print(string);
                //System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }
}
