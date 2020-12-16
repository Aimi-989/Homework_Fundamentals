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

        /*
        LocalDate [] dateArray = LocalDate1[2];
        for (int i = 0; i< dateArray.length; i++);
        LocalDate localDate2 = dateArray[i];
        */

    }
}
