package loops;

import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        int n = 2;
        int power = 1;

        while (true) {
            int result = (int) Math.pow(n, power);
            if (result > number) {
                break;
            }

            System.out.print(result + " ");
            power++;

    }
}

}
