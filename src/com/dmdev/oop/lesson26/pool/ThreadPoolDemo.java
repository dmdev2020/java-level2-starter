package com.dmdev.oop.lesson26.pool;

import java.util.concurrent.Executors;

public class ThreadPoolDemo {

    public static void main(String[] args) {
        Executors.newSingleThreadExecutor();
        Executors.newFixedThreadPool(5);
        Executors.newCachedThreadPool();

        Executors.newScheduledThreadPool(3);
        Executors.newWorkStealingPool();
    }
}
