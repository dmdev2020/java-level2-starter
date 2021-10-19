package com.dmdev.oop.lesson19.hw2.task1;

import java.util.HashMap;
import java.util.Map;

public final class WordUtil {

    private static final String EMPTY = "";
    private static final String SPACE = " ";

    private WordUtil() {
    }

    /**
     * 1. В интерфейсе Map есть много более удобных методов, которые подходят для решения этой задачи
     * (такие как merge, compute и другие), но они все используют функциональные интерфейсы, которые
     * будут рассматриваться в следующих темах.
     * Просто всегда нужно читать документацию к тем интерфейсам, которые хотим использовать
     * <p>
     * 2. Т.к. регулярные выражения еще не были пройдены, то для решения достаточно просто заменить
     * знаки пунктуации на пустые строки
     */
    public static Map<String, Integer> calcWordFrequency(String text) {
        Map<String, Integer> resultMap = new HashMap<>();
        String[] words = text
                .replace(".", EMPTY)
                .replace(",", EMPTY)
                .replace("!", EMPTY)
                .split(SPACE);
        for (String word : words) {
            Integer oldCount = resultMap.get(word);
            Integer newCount = oldCount == null ? 1 : oldCount + 1;
            resultMap.put(word, newCount);
        }

        return resultMap;
    }
}
