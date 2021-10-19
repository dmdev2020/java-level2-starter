package com.dmdev.oop.lesson26.latch;

import java.util.concurrent.CountDownLatch;

public class RocketDetailRunnable implements Runnable {

    private final RocketDetail rocketDetail;
    private final CountDownLatch countDownLatch;

    public RocketDetailRunnable(RocketDetail rocketDetail, CountDownLatch countDownLatch) {
        this.rocketDetail = rocketDetail;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("Готовится деталь: " + rocketDetail);
        try {
            Thread.sleep(1000L);
            System.out.println("Деталь готова: " + rocketDetail);
            countDownLatch.countDown();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
