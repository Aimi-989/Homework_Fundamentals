package primitive_data_types_and_operators;

public class Tasks {
    public static void main(String[] args) {
        int x = 4;
        int y = 7;

        System.out.println("task 1");
        System.out.println();

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);
        System.out.println();
        System.out.println("task 2");
        System.out.println();
        int a = 99;
        ++a;
        System.out.println(a);

        int b = 99;
        --b;
        System.out.println(b);

        System.out.println("-------------");

        int z = 3;
        int w = 7;
        z = ++w;
        System.out.println(z);

        System.out.println("-------------");

        int d = 3;
        int k = 7;

        d = k++;
        System.out.println(d);

        System.out.println();
        System.out.println("task 3");
        System.out.println();

        int p = 74;
        int q = 36;
        System.out.println(p+q);

        System.out.println();
        System.out.println("task 4");
        System.out.println();

        int xx = 50;
        int yy = 3;
        System.out.println("Result = " + (50 / 3));
        System.out.println("remainder = " + xx % yy);

        System.out.println();
        System.out.println("task 5");
        System.out.println();

        int g = 5;
        int f = 6;
        int j = 8;
        System.out.println("-5+8*6="+(-g+(j*f)));

        int v = 55;
        int n = 9;
        System.out.println("(55+9)%9="+(v+n)%n);

        int m = 20;
        int s = 3;
        System.out.println("20+-3*5/8=" + (m+ -s*g/j));

        int u = 15;
        int t = 2;
        System.out.println("5+13/3*2-8%3=" + (g+u/s*t-j%s));

        System.out.println();
        System.out.println("task 6");
        System.out.println();

        double sum = 25.5;
        double sam = 3.5;
        double som = 40.5;
        double sym = 4.5;
        System.out.println("((25.5*3.5-3.5*3.5)/(40.5-4.5))="+ (sum*sam-sam*sam)/(som-sym));

        System.out.println();
        System.out.println("task 9");
        System.out.println();

        int r = 25;
        int l = 39;
        boolean rNotEqualsl = r != l;
        System.out.println("25!=39 " + rNotEqualsl);
        System.out.println("25<39 " + (r<l));
        System.out.println("25<=39 " + (r<=l));

        System.out.println();
        System.out.println("task 10");
        System.out.println();

        int aa = 1;
        int bb = 3;
        int cc = 3;
        System.out.println("The sum of the digits of an integer 133 is " + (aa+bb+cc));



    }
}

