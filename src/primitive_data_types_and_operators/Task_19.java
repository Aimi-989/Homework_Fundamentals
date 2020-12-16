package primitive_data_types_and_operators;

import java.util.Scanner;

public class Task_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        int nn = n * 10 + n;
        int nnn = (n * 100) + (n * 10) + n;
        System.out.println(nn);
        System.out.println(nnn);
        System.out.println(n+nn+nnn);
        //System.out.println(n + (n * 10 + n) + (n * 100 + n * 10 + n));



    }
}
