package com.dmdev.oop.lesson25.task;

import java.util.Queue;

public class ConsumerThread implements Runnable {

    private final Queue<Integer> list;

    public ConsumerThread(Queue<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        synchronized (list) {
            while (true) {
                if (!list.isEmpty()) {
                    Integer removedValue = list.remove();
                    System.out.println("consumer get value: " + removedValue + ". Size: " + list.size());
                } else {
                    System.out.println("consumer is waiting, list is empty");
                }
                try {
                    int random = 80;
                    System.out.println("consumer waits: " + random);
//                    list.notifyAll();
                    list.wait(random);
                } catch (InterruptedException exception) {
                    exception.printStackTrace();
                }
            }
        }
    }
}
