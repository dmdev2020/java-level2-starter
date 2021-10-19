package com.dmdev.oop.lesson25.queue;

import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CashboxRunner {

    public static void main(String[] args) throws InterruptedException {
//        BlockingQueue<Cashbox> cashboxes = new ArrayBlockingQueue<>(2, true, List.of(new Cashbox(), new Cashbox()));
        Semaphore cashboxes = new Semaphore(2);
        List<Thread> threads = Stream.of(
                new BuyerThread(cashboxes),
                new BuyerThread(cashboxes),
                new BuyerThread(cashboxes),
                new BuyerThread(cashboxes),
                new BuyerThread(cashboxes),
                new BuyerThread(cashboxes),
                new BuyerThread(cashboxes),
                new BuyerThread(cashboxes)
        )
                .map(Thread::new)
                .peek(Thread::start)
                .collect(Collectors.toList());

        for (Thread thread : threads) {
            thread.join();
        }
    }
}
