package com.characters;

import com.strategy.MovementStrategy;

public class Pegasus extends CharacterOfGame {
    private MovementStrategy strategy;

    public Pegasus(MovementStrategy strategy) {
        super("Pegasus");
        this.strategy = strategy;
    }

    public void changeStrategy(MovementStrategy strategy) {
        this.strategy = strategy;
    }

    public void walkSomewhere() {
        strategy.move();
    }
}
