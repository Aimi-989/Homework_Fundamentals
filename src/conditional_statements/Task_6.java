package conditional_statements;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = scanner.nextInt();

        if (x % 3 == 0 && x % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (x % 3 == 0) {
            System.out.println("Fizz");
        } else if (x % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(x);

    }
  }
}
