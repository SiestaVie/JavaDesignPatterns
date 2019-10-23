package com.strategy;

public class FlyStrategy implements MovementStrategy {

    @Override
    public void move() {
        System.out.println("Fly");
    }
}
