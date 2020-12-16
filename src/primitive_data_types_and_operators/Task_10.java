package primitive_data_types_and_operators;

public class Task_10 {
    public static void main(String[] args) {

        int n = 133;
        int a = n / 100;     //1
        int b = n / 10 % 10; //3
        int c = n % 10;      //3

        System.out.println(a + b + c);

    }
}
