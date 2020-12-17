package conditional_statements;

public class Tasks_1_2_3 {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int x = 4;
        int y = 2;
        if (y > x) {
            System.out.println(y);
        } else {
            System.out.println(x);
        }

        System.out.println();
        System.out.println("Task 2");
        int a = 7;
        //int a = 8;
        if (a % 2 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        System.out.println();
        System.out.println("Task 3");
        int m = 20;
        int n = 15;
        int l = 40;
        if ((m-n) * (l-m) >= 0){
            System.out.println(m);
        }else if((n-m) * (l-n) >= 0){
            System.out.println(n);
        }else {
            System.out.println(l);
        }
    }
    }



