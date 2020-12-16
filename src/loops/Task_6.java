package loops;

public class Task_6 {
    public static void main(String[] args) {
        System.out.print("Divided by 3: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.print("Divided by 5: ");
            for (int j = 1; j < 100; j++) {
                if (j % 5 == 0) {
                    System.out.print(j + " ");
                }
            }
        System.out.println();
        System.out.print("Divided by 3 and 5: ");
                for (int n = 1; n < 100; n++) {
                    if (n % 3 == 0 && n % 5 == 0) {
                        System.out.print(n + " ");

                    }
                }
            }
        }





