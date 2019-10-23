package com.characters;

import com.strategy.MovementStrategy;

public class Troll extends CharacterOfGame {
    private MovementStrategy strategy;

    public Troll(MovementStrategy strategy) {
        super("Troll");
        this.strategy = strategy;
    }

    public void changeStrategy(MovementStrategy strategy) {
        this.strategy = strategy;
    }

    public void walkSomewhere() {
        strategy.move();
    }
}
