package com.dt;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Random;

public class AdditionalTimeTests {
    public static void main(String[] args) throws InterruptedException {
        Instant start =Instant.now();
        LocalDate dr = LocalDate.of(1991, Month.NOVEMBER, 18);

        System.out.println(dr.query(java.time.temporal.TemporalQueries.precision()));

        System.out.println(dr.toString()+" - "+dr.getDayOfWeek());
        LocalDate currDr = dr.withYear(Year.now().getValue());
        System.out.println(currDr+" - "+currDr.getDayOfWeek()+": "+Period.between(dr, currDr).get(ChronoUnit.YEARS));
        LocalDate nextDr = currDr.plusYears(1);
        System.out.println(nextDr+" - "+nextDr.getDayOfWeek()+": "+Period.between(dr, nextDr).get(ChronoUnit.YEARS));
        Thread.sleep(1000);
        //custom year
        LocalDate customDr = currDr.plusYears(new Random().nextInt(40) );
        System.out.println(customDr+" - "+customDr.getDayOfWeek()+": "+Period.between(dr, customDr).get(ChronoUnit.YEARS));

        Duration duration = Duration.between(start,Instant.now());
        System.out.println("Execution duration, mills: "+duration.toMillis());
    }
}
