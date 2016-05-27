package pers.crazymouse.exercises;

import java.util.GregorianCalendar;

public class Ex9_5 {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.printf("%d/%02d/%02d\n", calendar.get(GregorianCalendar.YEAR),
                calendar.get(GregorianCalendar.MONTH) + 1, calendar.get(GregorianCalendar.DATE));
        calendar.setTimeInMillis(1234567898765L);
        System.out.printf("%d/%02d/%02d\n", calendar.get(GregorianCalendar.YEAR),
                calendar.get(GregorianCalendar.MONTH) + 1, calendar.get(GregorianCalendar.DATE));
    }
}
