package com.characters;

import com.strategy.MovementStrategy;

public class Vampire extends CharacterOfGame {
    private MovementStrategy strategy;

    public Vampire(MovementStrategy strategy) {
        super("Vampire");
        this.strategy = strategy;
    }

    public void changeStrategy(MovementStrategy strategy) {
        this.strategy = strategy;
    }

    public void walkSomewhere() {
        strategy.move();
    }


}
