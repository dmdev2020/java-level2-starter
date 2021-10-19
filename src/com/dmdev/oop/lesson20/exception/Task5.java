package com.dmdev.oop.lesson20.exception;

/**
 * 5. Бросить одно из существующих в JDK исключений, отловить его и
 * выбросить своё собственное, указав в качестве причины отловленное.
 */
public class Task5 {

    public static void main(String[] args) {
        try {
            catchCustomException();
        } catch (DmdevException exception) {
            System.out.println("catched in main");
            exception.printStackTrace();
        }
    }

    public static void catchCustomException() {
        try {
            unsafe();
        } catch (RuntimeException exception) {
            System.out.println("Catch int catchCustomException method");
            throw new DmdevException(exception);
        }
    }

    public static void unsafe() {
        throw new RuntimeException("Ooops");
    }
}
