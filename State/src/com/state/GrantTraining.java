package com.state;

import java.util.Random;

public class GrantTraining {
    private State state;
    public static StringBuilder noticeStates = new StringBuilder("Your order had such stages of consideration :" + "\n");

    public GrantTraining() {
        this.state = new CreatedState(this);
        noticeStates.append(state.toString() + "\n");
        state.onEnterState();
    }

    /**
     * Makes time pass for the grantTraining
     */
    public void timePasses() {
        if (state.getClass().equals(CreatedState.class)) {
            changeStateTo(new ConsideringState(this));
        } else {

        }
    }

    private int getRandomNumb() {
        Random random = new Random();
        return random.ints(1, (4 + 1)).findFirst().getAsInt();
    }

    public void changeStateTo(State newState) {
        this.state = newState;
        noticeStates.append(newState.toString() + "\n");
        this.state.onEnterState();

    }

    @Override
    public String toString() {
        return "Grant Training";
    }
}
