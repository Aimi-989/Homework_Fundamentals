package loops;

public class Task_4 {

        public static void main(String[] args) {

            int n = 5;
            solution(n);
            //solution2(n);
        }
        //Two for loops + StringBuilder
        public static void solution(int n) {

            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 1; i < 6; i++) {
                for (int j = 1; j <= i; j++) {
                    stringBuilder.append(n);
                }
                if (i < 5) {
                    stringBuilder.append(", ");
                }
            }

            System.out.println(stringBuilder.toString());
        }

        //One while loop + math
        /*public static void solution2(int n) {

            int currentNumber = 0;
            int multiplier = 10;

            while (currentNumber < 9999) {

                currentNumber = currentNumber * multiplier + n;
                System.out.print(currentNumber);

                if (currentNumber < 9999) {
                    System.out.print(", ");
                }
            }
        }*/
    }