package com.dmdev.oop.lesson19.hw1.task2;

import com.dmdev.oop.lesson19.hw1.task2.comparator.StudentAgeComparator;
import com.dmdev.oop.lesson19.hw1.task2.comparator.StudentFullNameComparator;
import com.dmdev.oop.lesson19.hw1.task2.comparator.StudentMarkComparator;

import java.util.Arrays;
import java.util.List;

/**
 * 2. Создать класс Student, представляющий собой ученика.
 * Добавить ему данные об имени, фамилии, возрасте и
 * среднем балле за год.
 * Создать список (List) учеников. Найти и вывести ученика с
 * самым высоким средним баллом используя итератор.
 *  Отсортировать и вывести список учеников по полному имени
 * (имя + фамилия), возрасту и среднему баллу, используя
 * компараторы.
 */
public class StudentDemo {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Ivan", "Ivanov", 33, 5.4),
                new Student("Ivan", "Ivanov", 20, 9.7),
                new Student("Sveta", "Svetikova", 18, 7.2),
                new Student("Petr", "Petrov", 25, 8.5),
                new Student("Petr", "Petrov", 25, 8.9),
                new Student("Mike", "Glotov", 31, 6.6)
        );
        System.out.println(StudentHelper.getTheBestStudent(students));

        students.sort(new StudentFullNameComparator());
        System.out.println(students);

        students.sort(new StudentAgeComparator());
        System.out.println(students);

        students.sort(new StudentMarkComparator());
        System.out.println(students);

        students.sort(new StudentFullNameComparator().thenComparing(new StudentAgeComparator()));
        System.out.println(students);
    }
}
