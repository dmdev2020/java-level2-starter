package com.dmdev.oop.lesson27.hw.report;

import com.dmdev.oop.lesson27.hw.dto.LogFileDay;

import java.util.List;

public interface ReportGenerator {

    String generate(List<LogFileDay> logFileDays);
}
