package com.usc.csci201x;

public class Chad extends Person {

    private int relationships;
    private boolean isSingle;

    public int getRelationships() {
        return relationships;
    }

    public void setRelationships(int relationships) {
        this.relationships = relationships;
    }

    public boolean isSingle() {
        return isSingle;
    }

    public void setSingle(boolean single) {
        isSingle = single;
    }

    @Override
    public void sayCatchphrase() {
        System.out.println("Did you remember the flush my meth() ?");
    }
}
