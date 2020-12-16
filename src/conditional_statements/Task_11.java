package conditional_statements;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        System.out.print("Write the text: ");

        if (text.contains("Java")) {
            System.out.println("Found Java");
        }
        if (text.startsWith("Java")) {
            System.out.println("Starts with Java");
        }
        if (text.endsWith("Java")) {
            System.out.println("Ends with Java");
        } else {
            System.out.println("No Java");
        }
    }
}
        //String Java = "Java";
        //int index = Java.indexOf("Java");
        //System.out.println(index);
