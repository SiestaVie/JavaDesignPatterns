package com.state;

public class PendingState implements State {
    private GrantTraining grantTraining;

    public PendingState(GrantTraining grantTraining) {
        this.grantTraining = grantTraining;
    }


    @Override
    public void onEnterState() {
        System.out.println("Pending an order for a " + grantTraining);
    }

    @Override
    public String toString() {
        return "Pending";
    }
}
