package loops;

public class Task_7 {
    public static void main(String[] args) {
        int number = 3;
        int power = 1;

        while (true) {
            int result = (int) Math.pow(number, power);
            if (result > 100) {
                break;
            }

            System.out.print(result + " ");
            power++;

        }
    }
}







