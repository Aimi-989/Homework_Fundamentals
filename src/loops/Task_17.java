package loops;

public class Task_17 {
    public static void main(String args[]){
        int num = 13;
        boolean flag = false;
        for (int i = 2; i <= num/2; i++) {
            // condition for non-prime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag) //true
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
        /*
        int i;
        int x;
        int flag = 0;

        int num = 7; // number to be checked
        x = num / 2;

        if(n==0||n==1){
            System.out.println(num + " is not prime number");
        }else{
            for(i = 2; i <= x; i++){
                if(n % i == 0){
                    System.out.println(num + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) {
                System.out.println(num + " is prime number"); }
        }*/
