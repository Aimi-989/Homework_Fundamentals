package additional_exercises;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter letter: ");
        char letter = scanner.next().charAt(0);

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(letter + " ");
                letter++;
            }
            System.out.println();
        }
    }

    }

