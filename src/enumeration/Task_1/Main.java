package enumeration.Task_1;

class Main {
    public static void main(String[] args) {
        System.out.println(Weekday.MONDAY);
        System.out.println(Weekday.TUESDAY);
        System.out.println(Weekday.WEDNESDAY);
        System.out.println(Weekday.THURSDAY);
        System.out.println(Weekday.FRIDAY);
        System.out.println(Weekday.SATURDAY);
        System.out.println(Weekday.SUNDAY);
        System.out.println();

        boolean WeekDay = Weekday.MONDAY.equals(Weekday.MONDAY);
        boolean Holiday = Weekday.SUNDAY.equals(Weekday.SUNDAY);
        System.out.println(WeekDay);
        System.out.println(Holiday);

    }
}
