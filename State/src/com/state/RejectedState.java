package com.state;

public class RejectedState implements State {
    private GrantTraining grantTraining;

    public RejectedState(GrantTraining grantTraining) {
        this.grantTraining = grantTraining;
    }


    @Override
    public void onEnterState() {
        System.out.println("An order for a " + grantTraining + " has been rejected ");
    }

    @Override
    public String toString() {
        return "Rejected";
    }
}
