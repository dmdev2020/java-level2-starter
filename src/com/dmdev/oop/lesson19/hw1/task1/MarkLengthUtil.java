package com.dmdev.oop.lesson19.hw1.task1;

import java.util.List;
import java.util.ListIterator;

/**
 * Не забывать, что каждый утилитный класс должен быть final и иметь private constructor.
 * В современных Java приложениях используют сторонюю библиотеку Lombok, чтобы не писать это вручную каждый раз
 */
public final class MarkLengthUtil {

    private static final String TARGET_VALUE = "****";
    private static final int TARGET_LENGTH = 4;

    private MarkLengthUtil() {
    }

    /**
     * У наследников интерфейса List есть более мощный итератор - ListIterator, который наследуется от обычного
     * интерфейса Iterator, но предоставляет еще больше функциональности, которую можно использовать для свох нужд,
     * например, методы set, add и другие.
     */
    public static void markLength4(List<String> list) {
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String nextValue = listIterator.next();
            if (nextValue.length() == TARGET_LENGTH) {
                listIterator.set(TARGET_VALUE);
                listIterator.add(nextValue);
            }
        }
    }
}
