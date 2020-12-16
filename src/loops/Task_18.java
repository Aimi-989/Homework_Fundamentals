package loops;

public class Task_18 {
    public static void main(String[] args) {
        int a = 0;
        int n = 0;
        int i = 1;
        int j = 1;


        while(n < 4)
        {
            a = 0;
            j = 1;

            while(j <= i)
            {
                if(i % j == 0)
                    a++;
                j++;
            }
            if(a==2)
            {
                System.out.print(i + " ");
                n++;
            }
            i++;
        }
    }
}