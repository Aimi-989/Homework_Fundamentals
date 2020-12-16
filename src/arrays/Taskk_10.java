package arrays;

import java.util.Scanner;

public class Taskk_10 {

        public static void main(String[] args) {

            int[] inputArray = new int[]{1, 7, 3, 10, 9};
            printArray(inputArray);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter a number to insert: ");
            int number = scanner.nextInt();
            System.out.print("Please enter a position for insertion: ");
            int position = scanner.nextInt();

            int[] resultArray = new int[inputArray.length + 1];

            for (int i = 0; i < position; i++) {
                resultArray[i] = inputArray[i];
            }

            resultArray[position] = number;

            for (int i = position + 1; i < resultArray.length; i++) {
                resultArray[i] = inputArray[i - 1];
            }

            printArray(resultArray);
        }

        private static void printArray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }

