package com.dmdev.oop.lesson27.hw.dto;

import java.util.Arrays;
import java.util.Map;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;

public enum Activity {
    LECTURES("Лекции"),
    EXERCISES("Упражнения"),
    BREAK("Перерыв"),
    SOLUTIONS("Решения"),
    LUNCH_BREAK("Обеденный перерыв"),
    END("Конец");

    private static final Map<String, Activity> ACTIVITY_MAP = Arrays.stream(values())
            .collect(toMap(Activity::getName, identity()));

    private final String name;

    Activity(String name) {
        this.name = name;
    }

    public static Activity find(String activityName) {
        return ACTIVITY_MAP.getOrDefault(activityName, LECTURES);
    }

    public String getName() {
        return name;
    }
}
