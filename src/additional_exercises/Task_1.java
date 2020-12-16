package additional_exercises;

import java.time.LocalDate;
import java.time.Month;

public class Task_1 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2020,2,20);
        System.out.println(date);

        LocalDate date1 = LocalDate.of(2020, Month.FEBRUARY, 20);
        System.out.println(date1);

    }
}