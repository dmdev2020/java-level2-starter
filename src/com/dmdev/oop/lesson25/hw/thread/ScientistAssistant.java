package com.dmdev.oop.lesson25.hw.thread;


import com.dmdev.oop.lesson25.hw.model.Dump;
import com.dmdev.oop.lesson25.hw.model.RobotDetail;
import com.dmdev.oop.lesson25.hw.model.Scientist;
import com.dmdev.oop.lesson25.hw.util.NightConst;
import com.dmdev.oop.lesson25.hw.util.RandomUtil;

import java.util.ArrayList;
import java.util.List;

public class ScientistAssistant extends Thread {

    private static final int MAX_DETAILS_COUNT = 4;
    private final Night night;
    private final Scientist scientist;
    private final Dump dump;

    public ScientistAssistant(Scientist scientist, Dump dump, Night night) {
        this.scientist = scientist;
        this.dump = dump;
        this.night = night;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < NightConst.AMOUNT_OF_NIGHT; i++) {
                List<RobotDetail> robotDetails = gatherRobotDetailsFromFactory();
                scientist.addRobotDetails(robotDetails);
                waitNextNight();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private List<RobotDetail> gatherRobotDetailsFromFactory() {
        int detailsCount = RandomUtil.getNextWithoutZero(MAX_DETAILS_COUNT);
        List<RobotDetail> gatheredDetailsFromFactory = new ArrayList<>(MAX_DETAILS_COUNT);
        synchronized (dump.getLock()) {
            if (dump.size() <= detailsCount) {
                gatheredDetailsFromFactory.addAll(dump.removeAll());
            } else if (dump.isNotEmpty()) {
                for (int j = 0; j < detailsCount; j++) {
                    RobotDetail removedDetail = dump.remove(RandomUtil.getNext(dump.size()));
                    gatheredDetailsFromFactory.add(removedDetail);
                }
            }
            System.out.printf("%s assistant gathered next details: %s\n", scientist.getName(), gatheredDetailsFromFactory);
        }

        return gatheredDetailsFromFactory;
    }

    private void waitNextNight() throws InterruptedException {
        synchronized (night.getLock()) {
            night.getLock().wait();
        }
    }

    public Scientist getScientist() {
        return scientist;
    }
}
