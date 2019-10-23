package com.recipe;

public class Prescription {
    private Date date = new Date(0);
    private State state;

    public Prescription() {
        state = new CreatedState();
    }

    /**
     * Makes time pass for the prescription
     */
    public void timePasses() {
        if (date.getTodayDate() == 15) {
            changeStateTo(new DeadLineState(this));
        }
        if (state.getClass().equals(DeadLineState.class)) {
            changeStateTo(new ProlongedState(this));
        }
        if (state.getClass().equals(ProlongedState.class)) {
            changeStateTo(new IndefiniteState(this));
        }

    }

    public void changeStateTo(State newState) {
        this.state = newState;
        this.state.onEnterState();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(int dateNew) {
        date.setTodayDate(dateNew);
    }
}
