package conditional_statements;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Income: ");
        double income = scanner.nextDouble();
        double tax;

        if (income >= 85.528){
            tax = 14839.02 + ((income - 85.528) * 0.32);
        } else {
            tax = income * 0.18 - 556.02;

        } System.out.println(tax);
    }
}




