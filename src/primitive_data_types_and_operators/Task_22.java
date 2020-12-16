package primitive_data_types_and_operators;

public class Task_22 {
    public static void main(String[] args) {

        int n = 1776;
        int a = n / 10 / 100; //1
        int b = n / 10 % 10;  //7
        int c = n / 100 % 10; //7
        int d = n % 10;       //6

        System.out.println(a*1 + b*2 + c*3 + d*4);
    }
}
