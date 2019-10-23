package com.state;

public class WithdrawnState implements State {
    private GrantTraining grantTraining;

    public WithdrawnState(GrantTraining grantTraining) {
        this.grantTraining = grantTraining;
    }


    @Override
    public void onEnterState() {
        System.out.println("An order for a " + grantTraining + " has been withdrawn ");
    }

    @Override
    public String toString() {
        return "Withdrawn";
    }
}
