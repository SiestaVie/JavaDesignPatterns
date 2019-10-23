package com.recipe;

public class IndefiniteState implements State {
    private Prescription prescription;

    public IndefiniteState(Prescription prescription) {
        this.prescription = prescription;
    }

    @Override
    public void onEnterState() {
        prescription.setDate(5);
        System.out.println("Today is " + prescription.getDate().getTodayDate() + " day. The prescription validity period is 15 days");
    }
}
