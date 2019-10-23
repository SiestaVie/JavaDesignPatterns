package com.state;

public class ConfirmedState implements State {
    private GrantTraining grantTraining;

    public ConfirmedState(GrantTraining grantTraining) {
        this.grantTraining = grantTraining;
    }


    @Override
    public void onEnterState() {
        System.out.println("An order for a " + grantTraining + " has been confirmed ");
    }

    @Override
    public String toString() {
        return "Confirmed";
    }
}
