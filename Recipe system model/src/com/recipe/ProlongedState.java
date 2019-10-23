package com.recipe;

public class ProlongedState implements State {
    private Prescription prescription;

    public ProlongedState(Prescription prescription) {
        this.prescription = prescription;
    }


    @Override
    public void onEnterState() {
        prescription.setDate(0);
        System.out.println("The Prescription has been prolonged for 15 days");
    }

}
