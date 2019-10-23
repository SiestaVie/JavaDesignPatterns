package com.state;

import java.util.Random;

public class ConsideringState implements State {
    private GrantTraining grantTraining;

    public ConsideringState(GrantTraining grantTraining) {
        this.grantTraining = grantTraining;
    }

    @Override
    public void onEnterState() {
        System.out.println("Considering order for a " + grantTraining);
        int numb = getRandomNumb();
        switch (numb) {
            case 1:
                grantTraining.changeStateTo(new PendingState(grantTraining));
                break;
            case 2:
                grantTraining.changeStateTo(new RejectedState(grantTraining));
                break;
            case 3:
                grantTraining.changeStateTo(new ConfirmedState(grantTraining));
                break;
            case 4:
                grantTraining.changeStateTo(new WithdrawnState(grantTraining));
                break;
        }
        System.out.println(GrantTraining.noticeStates.toString());
    }

    private int getRandomNumb() {
        Random random = new Random();
        return random.ints(1, (4 + 1)).findFirst().getAsInt();
    }

    @Override
    public String toString() {
        return "Considering";
    }
}
