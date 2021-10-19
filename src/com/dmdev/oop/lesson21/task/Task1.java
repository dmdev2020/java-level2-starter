package com.dmdev.oop.lesson21.task;

import java.util.List;
import java.util.OptionalDouble;

/**
 * 1. Дан список целых чисел. Найти среднее всех
 * нечётных чисел, делящихся на 5.
 */
public class Task1 {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 3, 4, 6, 8, 20, 10);
        OptionalDouble optionalDouble = integers.stream()
                .filter(value -> value % 2 != 0)
                .filter(value -> value % 5 == 0)
                .mapToInt(Integer::intValue)
                .average();
        optionalDouble.ifPresent(System.out::println);
    }
}
