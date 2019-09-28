package com.usc.csci201x;

public class Virgin extends Person {

    private int attempts;
    private boolean isStillVirgin;

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public boolean isStillVirgin() {
        return isStillVirgin;
    }

    public void setStillVirgin(boolean stillVirgin) {
        this.isStillVirgin = stillVirgin;
    }

    @Override
    public void sayCatchphrase() {
        System.out.println("Hello.");
    }
}
