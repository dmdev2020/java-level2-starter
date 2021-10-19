package com.dmdev.oop.lesson25;

public class ThreadDemo {

    public static void main(String[] args) {
        SimpleThread simpleThread = new SimpleThread();
        simpleThread.start();
        try {
            simpleThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }
}
