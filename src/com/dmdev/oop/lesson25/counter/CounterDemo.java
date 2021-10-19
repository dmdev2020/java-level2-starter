package com.dmdev.oop.lesson25.counter;

/**
 * 3. В методе main создать 4 потока типа CounterThread,
 * передав один и тот же объект Counter и запустить их, дождаться выполнения
 * и вывести на консоль в текущее значение нашего счетчика:
 * counter.getCount()
 */
public class CounterDemo {

    /**
     * count++;
     *
     * 1. считывание
     * 2. изменяем
     * 3. запись
     *
     * ------ 8 -> 8 + 1 -> count -> 9
     *
     * ------ 8 -> 8 + 1 -> count -> 9
     */
    public static void main(String[] args) {
        Counter counter = new Counter();
        CounterThread counterThread1 = new CounterThread(counter);
        CounterThread counterThread2 = new CounterThread(counter);
        CounterThread counterThread3 = new CounterThread(counter);
        CounterThread counterThread4 = new CounterThread(counter);
        CounterThread counterThread5 = new CounterThread(counter);
        CounterThread counterThread6 = new CounterThread(counter);
        CounterThread counterThread7 = new CounterThread(counter);
        CounterThread counterThread8 = new CounterThread(counter);
        CounterThread counterThread9 = new CounterThread(counter);

        counterThread1.start();
        counterThread2.start();
        counterThread3.start();
        counterThread4.start();
        counterThread5.start();
        counterThread6.start();
        counterThread7.start();
        counterThread8.start();
        counterThread9.start();
        try {
            counterThread1.join();
            counterThread2.join();
            counterThread3.join();
            counterThread4.join();
            counterThread5.join();
            counterThread6.join();
            counterThread7.join();
            counterThread8.join();
            counterThread9.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter.getCount());
    }
}
