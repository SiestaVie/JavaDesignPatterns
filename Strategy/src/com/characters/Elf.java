package com.characters;

import com.strategy.MovementStrategy;

public class Elf extends CharacterOfGame {
    private MovementStrategy strategy;

    public Elf(MovementStrategy strategy) {
        super("Elf");
        this.strategy = strategy;
    }

    public void changeStrategy(MovementStrategy strategy) {
        this.strategy = strategy;
    }

    public void walkSomewhere() {
        strategy.move();
    }
}
