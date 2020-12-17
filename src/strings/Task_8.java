package strings;

import java.util.Scanner;

public class Task_8 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner (System.in);
            System.out.print("Write the word MAKARENA: ");
            String word = scanner.nextLine();

            String text = "Lorem ipsum dolor sit amet, consecteturd adipiscing elit, sed to eiusmod tempor incididunt ut labore et dolore magna aliqua";
            String replaceString = text.replace(","," -MAKARENA");

            System.out.println(replaceString);
        }
    }
