package additional_exercises;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task_3 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2014, 1, 23 );
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy::MM::dd");
        System.out.println(localDate.format(formatter));

        LocalDate localDate1 = LocalDate.of(2020, 3, 30 );
        formatter = DateTimeFormatter.ofPattern("MM-yyyy-dd");
        System.out.println(localDate1.format(formatter));

        int[] array = new int[3];
        array[0] = Math.abs(localDate.getYear() - localDate1.getYear());
        array[1] = Math.abs(localDate.getMonthValue() - localDate1.getMonthValue());
        array[2] = Math.abs(localDate.getDayOfMonth() - localDate1.getDayOfMonth());
        for (int i : array) {
            System.out.print(i + " ");

    }
}
}
