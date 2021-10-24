package com.dmdev.oop.lesson24.hw;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjusters;

/**
 * Написать свою реализацию интерфейса TemporalAdjuster,
 * которая бы изменяла дату на ближайшее (в днях) 1 января
 */
public class Task1 {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(LocalDate.of(2018, 8, 27), LocalTime.MIDNIGHT);
        LocalDateTime result = adjustToNearestYear(localDateTime);
        System.out.println(result);
    }

    private static LocalDateTime adjustToNearestYear(LocalDateTime localDateTime) {
        return localDateTime.with(it -> {
            Temporal currentYear = it.with(TemporalAdjusters.firstDayOfYear());
            Temporal nextYear = it.with(TemporalAdjusters.firstDayOfNextYear());
            long betweenCurrentYear = ChronoUnit.DAYS.between(currentYear, it);
            long betweenNextYear = ChronoUnit.DAYS.between(it, nextYear);

            return betweenCurrentYear < betweenNextYear ? currentYear : nextYear;
        });
    }
}
