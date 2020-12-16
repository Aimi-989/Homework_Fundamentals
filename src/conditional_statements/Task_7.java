package conditional_statements;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int x = scanner.nextInt();

        if (x % 400 == 0){
            System.out.println("This is a leap year");
        }else if(x % 4 == 0 && x % 100 != 0){
            System.out.println("This is a leap year");
        }else {
            System.out.println("This is not a leap year");
        }
    }
    }

