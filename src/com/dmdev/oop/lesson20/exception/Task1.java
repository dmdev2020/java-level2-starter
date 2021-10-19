package com.dmdev.oop.lesson20.exception;

/**
 * 1. Объявите переменную со значением null. Вызовите метод у этой
 * переменной. Отловите возникшее исключение.
 */
public class Task1 {

    public static void main(String[] args) {
        String value = null;
        try {
            value.length();
        } catch (NullPointerException exception) {
            System.err.println("Catch");
            exception.printStackTrace();
        }
    }
}
