package com.usc.csci201x;

public class DemoThread implements Runnable {

    public int threadNumber = 0;

    public DemoThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        System.out.println("Starting thread " + threadNumber + "......");
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread " + threadNumber + " iteration " + i + ".");
        }
    }
}
