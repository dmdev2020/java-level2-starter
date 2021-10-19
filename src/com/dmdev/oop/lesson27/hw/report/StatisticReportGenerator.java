package com.dmdev.oop.lesson27.hw.report;

import com.dmdev.oop.lesson27.hw.dto.Activity;
import com.dmdev.oop.lesson27.hw.dto.LogFileDay;
import com.dmdev.oop.lesson27.hw.util.ActivityUtils;

import java.time.temporal.ChronoUnit;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class StatisticReportGenerator implements ReportGenerator {

    private static final String DETAILED_PART_PREFIX = "Лекции:";
    private static final String REPORT_PART_ROW_FORMAT = "%s: %d минут %d%%";

    @Override
    public String generate(List<LogFileDay> logFileDays) {
        return logFileDays.stream()
                .flatMap(logFileDay -> Stream.of(generateCommonPart(logFileDay), generateDetailedPart(logFileDay)))
                .collect(joining(System.lineSeparator() + System.lineSeparator()));
    }

    private String generateCommonPart(LogFileDay logFileDay) {
        Map<Activity, Long> activitiesTime = new EnumMap<>(Activity.class);
        ActivityUtils.consumeActivityDuration(logFileDay, (currentActivity, nextActivity) -> {
            long minutesDuration = ChronoUnit.MINUTES.between(currentActivity.getTime(), nextActivity.getTime());
            activitiesTime.merge(Activity.find(currentActivity.getActivityName()), minutesDuration, Long::sum);
        });

        long allTime = activitiesTime.values().stream().mapToLong(Long::longValue).sum();
        return activitiesTime.entrySet().stream()
                .map(entry -> buildReportPartRow(entry.getKey().getName(), entry.getValue(), allTime))
                .collect(joining(System.lineSeparator()));
    }

    private String generateDetailedPart(LogFileDay logFileDay) {
        Map<String, Long> lectures = new HashMap<>();
        AtomicLong allTime = new AtomicLong();
        ActivityUtils.consumeActivityDuration(logFileDay, (currentActivity, nextActivity) -> {
            var minutesDuration = ChronoUnit.MINUTES.between(currentActivity.getTime(), nextActivity.getTime());
            allTime.addAndGet(minutesDuration);
            if (Activity.find(currentActivity.getActivityName()) == Activity.LECTURES) {
                lectures.put(currentActivity.getActivityName(), minutesDuration);
            }
        });

        return Stream.concat(
                  Stream.of(DETAILED_PART_PREFIX),
                  lectures.entrySet().stream().map(it -> buildReportPartRow(it.getKey(), it.getValue(), allTime.get())))
               .collect(joining(System.lineSeparator()));
    }

    private String buildReportPartRow(String name, long activityTime, long allTime) {
        var percent = (long) ((double) activityTime / allTime * 100);
        return String.format(REPORT_PART_ROW_FORMAT, name, activityTime, percent);
    }
}
