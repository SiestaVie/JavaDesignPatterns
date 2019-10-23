package com.state;

public class CreatedState implements State {
    private GrantTraining grantTraining;

    public CreatedState(GrantTraining grantTraining) {
        this.grantTraining = grantTraining;
    }

    @Override
    public void onEnterState() {
        System.out.println("Your order for a " + grantTraining + " has been created ");
    }

    @Override
    public String toString() {
        return "Created";
    }
}
