package primitive_data_types_and_operators;

public class Tasks_11_12_13_14 {
    public static void main(String[] args) {
        System.out.println("Task 11");
        int a = 5;
        int b = 7;
        int P = (a+b)*2;
        int S = a*b;
        System.out.println("The field of a rectangle is " + S);
        System.out.println("The circumference of a rectangle is " + P);
        System.out.println();

        System.out.println("Task 12");
        int x = 8;
        int y = 9;
        int SSS = x*y/2;
        System.out.println("The field of a right-angled triangle is " + SSS);
        System.out.println();

        System.out.println("Task 13");
        int d = 10;
        int r = d/2;
        int r1 = 2;
        double PP = 2*r*Math.PI;
        double SS = Math.PI*Math.pow(r, r1);
        System.out.println("The field of a circle is " + SS);
        System.out.println("The circumference of a circle is " + PP);
        System.out.println();

        System.out.println("Task 14");
        int n = 8;
        int m = 6;
        int h = 10;
        System.out.println((n*n) + " + " + (m*m) + " = " + (h*h) + " it is right-angled");



    }
}
