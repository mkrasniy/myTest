package com.dt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class DateTimeTest {
    public static void main(String[] args) {
        LocalDate dateOfBirth = LocalDate.of(2015, Month.SEPTEMBER, 14);
        System.out.println("LocalDate.of(2015, Month.SEPTEMBER, 14)="+dateOfBirth);
        LocalDate firstBirthday = dateOfBirth.plusYears(1);
        System.out.println("dateOfBirth.plusYears(1)="+firstBirthday);
        System.out.println("firstBirthday.getEra()="+firstBirthday.getEra());
        System.out.println(LocalDate.MAX);
        System.out.println(firstBirthday.isLeapYear());

        //DAY OF WEEK
        DayOfWeek dow = DayOfWeek.MONDAY;
        Locale locale = Locale.getDefault();
        System.out.println(dow.getDisplayName(TextStyle.FULL, locale));
        System.out.println(dow.getDisplayName(TextStyle.NARROW, locale));
        System.out.println(dow.getDisplayName(TextStyle.SHORT, locale));

    }
}
