package additional_exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_11 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("YYMMDDXXXXC");
        Matcher matcher = pattern.matcher("191212GFBN0");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("valid");
        } else {
            System.out.println("no valid");
        }
    }
}
