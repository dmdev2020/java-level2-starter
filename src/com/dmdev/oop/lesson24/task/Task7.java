package com.dmdev.oop.lesson24.task;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * 6. Создать объект Instant. Вывести его на консоль. Затем создать
 * объект ZonedDateTime на основании предыдущего объекта с тайм зоной "Africa/Cairo".
 */
public class Task7 {

    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);

        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("Africa/Cairo"));
        System.out.println(zonedDateTime);
    }
}
