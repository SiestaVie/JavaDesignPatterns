package com.recipe;

public class DeadLineState implements State {
    private Prescription prescription;

    public DeadLineState(Prescription prescription) {
        this.prescription = prescription;
    }

    @Override
    public void onEnterState() {
        System.out.println("Today is 15-th day it is the deadline day");
    }

}
