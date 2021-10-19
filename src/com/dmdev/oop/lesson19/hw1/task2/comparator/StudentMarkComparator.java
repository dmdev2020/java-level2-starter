package com.dmdev.oop.lesson19.hw1.task2.comparator;

import com.dmdev.oop.lesson19.hw1.task2.Student;

import java.util.Comparator;

public class StudentMarkComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getAverageMark(), o2.getAverageMark());
    }
}
