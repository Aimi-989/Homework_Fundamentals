package conditional_statements;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter yours height(cm) and weight(kg): ");

        int height = scanner.nextInt(); //height cm
        float weight = scanner.nextFloat(); //weight kg

        if (height > 150 && weight <= 180f) {
        System.out.println("Fasten your seatbelt");
        } else
            { System.out.println("I am sorry you cannot go!");
            }
    }
}
