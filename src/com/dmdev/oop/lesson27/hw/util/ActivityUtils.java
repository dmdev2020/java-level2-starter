package com.dmdev.oop.lesson27.hw.util;

import com.dmdev.oop.lesson27.hw.dto.LogFileDay;
import com.dmdev.oop.lesson27.hw.dto.LogFileRow;

import java.util.List;
import java.util.function.BiConsumer;

public final class ActivityUtils {

    private ActivityUtils() {
    }

    public static void consumeActivityDuration(LogFileDay logFileDay, BiConsumer<LogFileRow, LogFileRow> consumer) {
        List<LogFileRow> rows = logFileDay.getRows();
        for (int i = 0; i < rows.size() - 1; i++) {
            var currentActivity = rows.get(i);
            var nextActivity = rows.get(i + 1);
            consumer.accept(currentActivity, nextActivity);
        }
    }
}
