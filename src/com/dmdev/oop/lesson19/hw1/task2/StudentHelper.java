package com.dmdev.oop.lesson19.hw1.task2;

import java.util.List;

/**
 * Не забывать, что каждый утилитный класс должен быть final и иметь private constructor.
 * В современных Java приложениях используют сторонюю библиотеку Lombok, чтобы не писать это вручную каждый раз
 */
public final class StudentHelper {

    private StudentHelper() {
    }

    /**
     * Всегда нужно быть аккуратным с коллекциями, ибо они могут приходить пустыми. Следовательно,
     * нельзя брать первые элемент из этой коллекции без предварительной проверки, что он существует
     */
    public static Student getTheBestStudent(List<Student> students) {
        Student theBestStudent = null;
        for (Student student : students) {
            if (theBestStudent == null || theBestStudent.getAverageMark() < student.getAverageMark()) {
                theBestStudent = student;
            }
        }
        return theBestStudent;
    }
}
