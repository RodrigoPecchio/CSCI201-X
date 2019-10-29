package com.usc.csci201x;

public class BravoSixThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Starting Bravo Six thread......");
        System.out.println("Bravo Six, going dark.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.err.println("On your feet, we are leaving! " + e.getMessage());
        }
        System.out.println("You want the gloves off? They're off.");
    }
}
