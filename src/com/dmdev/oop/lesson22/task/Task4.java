package com.dmdev.oop.lesson22.task;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * 4. Задан файл с java-кодом. Прочитать текст программы из файла и
 * все слова public в объявлении атрибутов и методов класса заменить
 * на слово private. Результат сохранить в другой заранее созданный
 * файл.
 */
public class Task4 {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("src", "com", "dmdev", "lesson22", "task", "Task3.java");
        String stringValue = Files.readString(path);

        String result = stringValue.replace("public", "private");

        Path resultPath = Path.of("resources", "Task3.java");
        Files.writeString(resultPath, result);
    }
}
