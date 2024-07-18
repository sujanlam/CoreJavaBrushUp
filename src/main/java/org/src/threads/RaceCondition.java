package org.src.threads;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Counter {
    int count;
    public synchronized void increment() {
        count++;
    }
}
public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();
        Runnable aa =  () -> {
            for (int i = 1; i <= 10000; i++) {
                c.increment();
            }
        };
        Runnable bb = () -> {
            for (int i = 1; i <= 10000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(aa);
        Thread t2 = new Thread(bb);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}
