package lecture01.examples;

public class Turnover {
    public static void main(String[] args) {
        int weeks = 52;
        int weekdays = 5;
        int weekendDays = 1;

        int weekdayUnits = 20;
        int weekdayPrice = 10;

        int weekendUnits = 30;
        int weekendPrice = 8;

        int turnover = weeks * ( weekdays * weekdayUnits * weekdayPrice + weekendDays * weekendUnits * weekendPrice );

        System.out.println(turnover);
    }
}
