package com.dmdev.oop.lesson18.hw;

public final class PairUtil {

    private PairUtil() {
    }

    public static <K, V> Pair<V, K> swap(Pair<K, V> source) {
        V second = source.getSecond();
        K first = source.getFirst();
        return new Pair<>(second, first);
    }
}
