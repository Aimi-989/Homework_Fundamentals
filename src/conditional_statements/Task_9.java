package conditional_statements;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Income: ");
        double income = scanner.nextDouble();
        double tax;

        if (income > 85.528){
            tax = 14.839 * 0.32;
            System.out.println();
        }else if (income < 85.528){
            tax = 0.18;
            System.out.println();
        }

        }
    }




