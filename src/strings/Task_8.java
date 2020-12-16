package strings;

import java.util.Scanner;

public class Task_8 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner (System.in);
            System.out.println("Write the word MAKARENA: ");
            String word = scanner.next();

            String word1 = "Lorem ipsum dolor sit amet, consecteturd adipiscing elit, sed to eiusmod tempor incididunt ut labore et dolore magna aliqua";
            String replaceString = word.replace(","," -MAKARENA");

            System.out.println(replaceString);
        }
    }
