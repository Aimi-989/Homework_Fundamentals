package loops;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        int count = 0;
        System.out.print("Enter a word: ");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        for (int i=0 ; i<sentence.length(); i++){
            char ch = sentence.charAt(i);
            //char[] ch = sentence.length().toLowerCase().toCharArray();
            if(ch == 'a'|| ch == 'o'|| ch == 'u' || ch == 'i' ||
                    ch == 'y'|| ch == 'e' || ch == 'A' || ch == 'O' ||
            ch == 'U' || ch == 'I' || ch == 'Y' || ch == 'E'){
                count++;
            }
        }
        System.out.println("Vowels: " + count);
    }
}
