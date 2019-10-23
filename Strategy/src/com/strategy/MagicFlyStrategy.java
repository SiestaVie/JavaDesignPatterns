package com.strategy;

public class MagicFlyStrategy implements MovementStrategy {

    @Override
    public void move() {
        System.out.println("Magic Fly");
    }
}
