package loops;


public class Task_19 {
    public static void main(String[] args) {
        String text = "Some men interpret nine memos".replace(" "," ");
        String reverse = " ";

        for (int i = text.length()-1; i >= 0; i--){
            reverse = reverse + text.charAt(i);
        }
        if (text.equalsIgnoreCase(reverse)){
            System.out.println("The string is palindrome");
        } else {
            System.out.println("The string is not palindrome");
        }
    }
}
