package arrays;

//import java.lang.*;
//import java.lang.Character;

public class Task_23 {
    public static void main(String[] args) {
        String string = "Aa kiu, I swd skieo 2387. GH kiu: sieo?? 25.33";

        char[] ch = string.toCharArray();
        int letters = 0;
        int numbers = 0;
        int spaces = 0;
        int others = 0;

        for (int i = 0; i < string.length(); i++){
            if(Character.isLetter(ch[i])){
                letters++;
            }
            else if (Character.isDigit(ch[i])){
                numbers++;
            }
            else if(Character.isSpaceChar(ch[i])){
                spaces++;
            }
            else{
                others++;
            }
        }
        System.out.println(letters + " letters");
        System.out.println(numbers + " numbers");
        System.out.println(spaces + " spaces");
        System.out.println(others + " others");
    }
}
