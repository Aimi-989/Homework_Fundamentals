package arrays;

import java.util.Scanner;

class BracketsPairings {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter arithmetic expression using brackets: ");
        String input = scanner.nextLine();

        boolean isCorrect = checkBracketPairings(input);
        if (isCorrect) {
            System.out.println("Correct pairing of brackets");
        } else {
            System.out.println("Incorrect pairing of brackets");
        }
    }

    public static boolean checkBracketPairings(String input) {

        char[] charArray = input.toCharArray();
        char[] stack = new char[charArray.length];
        int currentIndex = 0;

        for (int i = 0; i < charArray.length; i++) {

            if (charArray[i] == '(') {
                stack[currentIndex++] = '(';
            } else if (charArray[i] == ')') {
                if (currentIndex == 0 || (stack[currentIndex - 1] != '(')) {
                    return false;
                } else {
                    stack[--currentIndex] = Character.MIN_VALUE;
                }
            }
        }

        if (currentIndex != 0) return false;

//        for (int i = 0; i < stack.length; i++) {
//            if (stack[i] == '(') {
//                return false;
//            }
//        }

        return true;
    }
}