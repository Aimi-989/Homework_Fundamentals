package loops;

import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = 0;

        while (a <= b) {
            sum += a;
            a++;
        }
        System.out.println(sum);

    }
}
