package com.dmdev.oop.lesson21;

import java.util.stream.Stream;

public class MapReduceExample {

    /**
     * [1000_000] -> age -> max
     * <p>
     * [1000_000] -> age -> max  -> max
     * <p>
     * [1000_000] -> age -> max
     */
    public static void main(String[] args) {
        Stream.of(
                new Student(18, "Ivan"),
                new Student(23, "Petr"),
                new Student(34, "Vasya"),
                new Student(45, "Sveta"),
                new Student(20, "Katya"),
                new Student(68, "Den"),
                new Student(101, "Kira")
        )
                .sequential()
                .map(Student::getAge)
                .reduce(Integer::sum)
                .ifPresent(System.out::println);
    }
}
