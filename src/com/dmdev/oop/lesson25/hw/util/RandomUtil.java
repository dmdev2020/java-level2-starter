package com.dmdev.oop.lesson25.hw.util;

import java.util.Random;

public final class RandomUtil {

    private static final Random RANDOM = new Random();

    private RandomUtil() {
    }

    public static int getNextWithoutZero(int bound) {
        return RANDOM.nextInt(bound) + 1;
    }

    public static int getNext(int bound) {
        return RANDOM.nextInt(bound);
    }
}
