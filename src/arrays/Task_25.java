package arrays;

public class Task_25 {
    public static void main(String[] args) {
        String text = "avaJ";
        String reverse = "";

        for (int i = text.length()-1; i >= 0; i--){
            reverse = reverse + text.charAt(i);
        }
        System.out.println(reverse);
    }
}
