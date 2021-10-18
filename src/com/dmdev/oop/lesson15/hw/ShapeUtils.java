package com.dmdev.oop.lesson15.hw;

/**
 * Не забывать, что каждый утилитный класс (это класс, что содержит исключительно static методы и поля)
 * должен быть final и иметь private constructor.
 * В современных Java приложениях используют сторонюю библиотеку Lombok, чтобы не писать это вручную каждый раз
 */
public final class ShapeUtils {

    private ShapeUtils() {
    }

    public static boolean isRectangle(Figure figure) {
        return figure instanceof Rectangle;
    }

    public static boolean isTriangle(Figure figure) {
        return figure instanceof Triangle;
    }
}
