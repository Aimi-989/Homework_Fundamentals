package conditional_statements;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write the text: ");
        String text = scanner.nextLine();

        if (text.contains("Java")) {
            System.out.println("Found Java");
        }
        if (text.startsWith("Java")) {
            System.out.println("Starts with Java");
        }
        if (text.endsWith("Java")) {
            System.out.println("Ends with Java");
        }
        if (!text.contains("Java")){
            System.out.println("No Java");
        }
        if (text.equals("Java")){
            System.out.println("Equals Java");
        }
        int index = text.indexOf("Java");
        System.out.println(index);
    }
}
