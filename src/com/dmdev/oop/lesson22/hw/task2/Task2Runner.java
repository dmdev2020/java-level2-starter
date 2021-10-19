package com.dmdev.oop.lesson22.hw.task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.TRUNCATE_EXISTING;

public class Task2Runner {

    public static void main(String[] args) throws IOException {
        Path resultPath = Path.of("resources", "task2-result.txt");
        Files.write(resultPath, RandomUtil.generateDigits(100), CREATE, TRUNCATE_EXISTING);
        Files.write(resultPath, DigitHelper.readSorted(resultPath), TRUNCATE_EXISTING);
    }
}
