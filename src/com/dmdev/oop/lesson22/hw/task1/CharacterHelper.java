package com.dmdev.oop.lesson22.hw.task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

public final class CharacterHelper {

    private CharacterHelper() {
    }

    public static Map<Character, Integer> calcFrequency(Path path) throws IOException {
        try (Stream<String> lines = Files.lines(path, UTF_8)) {
            return lines.map(String::chars)
                    .flatMapToInt(identity())
                    .mapToObj(intValue -> (char) intValue)
                    .filter(Character::isLetter)
                    .map(Character::toLowerCase)
                    .collect(toMap(identity(), it -> 1, Integer::sum));
        }
    }

    public static List<String> toListRepresentation(Map<Character, Integer> characterFrequency) {
        return characterFrequency.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .map(entry -> entry.getKey() + " - " + entry.getValue())
                .collect(toList());
    }
}
