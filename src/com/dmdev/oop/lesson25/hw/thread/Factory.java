package com.dmdev.oop.lesson25.hw.thread;

import com.dmdev.oop.lesson25.hw.model.Dump;
import com.dmdev.oop.lesson25.hw.model.RobotDetail;
import com.dmdev.oop.lesson25.hw.util.NightConst;
import com.dmdev.oop.lesson25.hw.util.RandomUtil;

import java.util.Collections;
import java.util.List;

public class Factory extends Thread {

    private static final int MAX_DETAILS_COUNT = 4;
    private final Night night;
    private final Dump dump;

    public Factory(Night night) {
        this(night, Collections.emptyList());
    }

    public Factory(Night night, List<RobotDetail> initialRobotDetails) {
        this.dump = new Dump(initialRobotDetails);
        this.night = night;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < NightConst.AMOUNT_OF_NIGHT; i++) {
                throwNewRobotDetails();
                waitNextNight();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void throwNewRobotDetails() {
        int countDetailsForThrowingToDump = RandomUtil.getNextWithoutZero(MAX_DETAILS_COUNT);
        synchronized (dump.getLock()) {
            for (int j = 0; j < countDetailsForThrowingToDump; j++) {
                RobotDetail robotDetail = RobotDetail.CASHED_VALUES.get(RandomUtil.getNext(RobotDetail.CASHED_VALUES.size()));
                dump.add(robotDetail);
            }
            System.out.println("Factory threw out robot details. Count: " + countDetailsForThrowingToDump);
        }
    }

    private void waitNextNight() throws InterruptedException {
        synchronized (night.getLock()) {
            night.getLock().wait();
        }
    }

    public Dump getDump() {
        return dump;
    }
}
