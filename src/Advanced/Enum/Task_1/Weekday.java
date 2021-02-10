package Advanced.Enum.Task_1;

public enum Weekday {
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    boolean weekDay;

    Weekday (boolean WeekDay){
        this.weekDay = WeekDay;
    }

    public boolean isWeekDay() {
        return weekDay;
    }

    public boolean isHoliday() {
        return !weekDay; // ! = NOT != -> not equals
    }

   /* boolean numbers;

   Weekday (boolean WeekDay, boolean Holiday){
       this.numbers = WeekDay;
       this.numbers = Holiday;
*/

}

