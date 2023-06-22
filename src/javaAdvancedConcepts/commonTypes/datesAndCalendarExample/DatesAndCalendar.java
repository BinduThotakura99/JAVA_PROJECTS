package javaAdvancedConcepts.commonTypes.datesAndCalendarExample;

import java.util.Calendar;
import java.util.Date;


public class DatesAndCalendar {
    public static void main(String[] args) {
        DatesAndCalendar.displayCurrentDate();
        DatesAndCalendar.displaySetDate();
    }

    public static void displayCurrentDate() {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        Date date = new Date();
        System.out.println(date);
        calendar.setTime(date);
        System.out.println(calendar.getTime());
    }

    public static void displaySetDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2031,05,02);
        Date date = calendar.getTime();
        System.out.println(date);
    }
}
