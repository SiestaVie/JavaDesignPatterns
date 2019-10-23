package com.recipe;

public class CreatedState implements State {

    @Override
    public void onEnterState() {
        System.out.println("Has been created");
    }

}
