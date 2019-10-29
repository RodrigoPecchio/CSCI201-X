package com.usc.csci201x;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) throws InterruptedException {
//        startJoinDemo();
//        threadExecutorDemo();
        threadPriorityDemo();
    }

    private static void startJoinDemo() throws InterruptedException {
        Thread d0 = new Thread(new DemoThread(0));
        Thread d1 = new Thread(new DemoThread(1));
        Thread d2 = new Thread(new DemoThread(2));
        Thread b06 = new Thread(new BravoSixThread());
        d0.start();
        d0.join();
        d1.start();
        d2.start();
        d1.join();
        d2.join();
        b06.start();
//        b06.interrupt();
    }

    private static void threadExecutorDemo() {
        Thread d0 = new Thread(new DemoThread(0));
        Thread d1 = new Thread(new DemoThread(1));
        Thread d2 = new Thread(new DemoThread(2));
        Thread b06 = new Thread(new BravoSixThread());
        ExecutorService e = Executors.newFixedThreadPool(1);
        e.execute(d0);
        e.execute(d1);
        e.execute(d2);
        e.execute(b06);
        e.shutdown();
        while (!e.isTerminated()) {
            Thread.yield();
        }
        System.out.println("One-four-one.");
    }

    private static void threadPriorityDemo() {
        Thread d0 = new Thread(new DemoThread(0));
        Thread d1 = new Thread(new DemoThread(1));
        Thread d2 = new Thread(new DemoThread(2));
        Thread b06 = new Thread(new BravoSixThread());
        b06.setPriority(Thread.MAX_PRIORITY);
        d0.setPriority(Thread.MIN_PRIORITY);
        d0.start();
        d1.start();
        d2.start();
        b06.start();
    }
}
