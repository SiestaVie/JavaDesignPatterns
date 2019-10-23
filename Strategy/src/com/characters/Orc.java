package com.characters;

import com.strategy.MovementStrategy;

public class Orc extends CharacterOfGame {
    private MovementStrategy strategy;

    public Orc(MovementStrategy strategy) {
        super("Orc");
        this.strategy = strategy;
    }

    public void changeStrategy(MovementStrategy strategy) {
        this.strategy = strategy;
    }

    public void walkSomewhere() {
        strategy.move();
    }
}
