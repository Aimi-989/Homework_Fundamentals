package primitive_data_types_and_operators;
import java.util.Scanner;

public class Task_7 {

        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number 10: ");
        int x = scanner.nextInt();
        System.out.print("Please enter the number 20: ");
        int y = scanner.nextInt();
        System.out.print("Please enter the number 30: ");
        int z = scanner.nextInt();

        int sum = x + y + z;
        double average = sum / 3.0;
        System.out.println("Average = " + average);
    }
    }

