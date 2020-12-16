package loops;

import java.util.Scanner;

public class Task_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i=1; i <= 5; i++){
            sum = sum + n;
        }
        System.out.println("The sum is: ");


    }
}
