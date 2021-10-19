package com.dmdev.oop.lesson24.task;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * 4. Использовать LocalDateTime из предыдущего задания, преобразовать его
 * в объект типа Instant, указав тайм зону "America/Chicago". Вывести количество
 * прошедших миллисекунд.
 */
public class Task4 {

    public static void main(String[] args) {
        String formattedDate = "26-03-1968T09:24";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm");
        LocalDateTime localDateTime = LocalDateTime.parse(formattedDate, formatter);
        System.out.println(localDateTime);

        Instant instant = localDateTime.toInstant(ZoneId.of("America/Chicago").getRules().getOffset(localDateTime));
        System.out.println(instant);
        System.out.println(instant.toEpochMilli());
    }
}
