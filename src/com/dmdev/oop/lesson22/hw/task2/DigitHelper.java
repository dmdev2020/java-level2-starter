package com.dmdev.oop.lesson22.hw.task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.util.stream.Collectors.toList;

public final class DigitHelper {

    private DigitHelper() {
    }

    public static List<String> readSorted(Path filePath) throws IOException {
        try (Stream<String> lines = Files.lines(filePath, UTF_8)) {
            return lines.mapToInt(Integer::parseInt)
                    .sorted()
                    .mapToObj(String::valueOf)
                    .collect(toList());
        }
    }
}
