package primitive_data_types_and_operators;


import java.util.Scanner;

        public class Task_17 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter a number: ");
            int x = scanner.nextInt();
            System.out.print("Please enter a number: ");
            int y = scanner.nextInt();
            System.out.print("Please enter a number: ");
            int z = scanner.nextInt();
            System.out.print("Please enter a number: ");
            int w = scanner.nextInt();
            System.out.print("Please enter a number: ");
            int v = scanner.nextInt();

            int sum = x + y + z + w + v;
            double average = sum / 5.0;
            System.out.println("Sum = " + sum);
            System.out.println("Average value = " + average);
        }
    }


