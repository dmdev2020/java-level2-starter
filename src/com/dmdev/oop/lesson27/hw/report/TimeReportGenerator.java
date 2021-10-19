package com.dmdev.oop.lesson27.hw.report;

import com.dmdev.oop.lesson27.hw.dto.LogFileDay;
import com.dmdev.oop.lesson27.hw.util.ActivityUtils;
import com.dmdev.oop.lesson27.hw.util.StringUtils;

import java.util.List;

import static java.util.stream.Collectors.joining;

public class TimeReportGenerator implements ReportGenerator {

    @Override
    public String generate(List<LogFileDay> logFileDays) {
        return logFileDays.stream()
                .map(this::convertDay)
                .collect(joining(System.lineSeparator()));
    }

    private String convertDay(LogFileDay logFileDay) {
        var result = new StringBuilder();
        ActivityUtils.consumeActivityDuration(logFileDay, (currentActivity, nextActivity) ->
                result.append(currentActivity.getTime().toString())
                        .append(StringUtils.DASH)
                        .append(nextActivity.getTime().toString())
                        .append(StringUtils.SPACE)
                        .append(currentActivity.getActivityName())
                        .append(System.lineSeparator()));

        return result.toString();
    }
}
