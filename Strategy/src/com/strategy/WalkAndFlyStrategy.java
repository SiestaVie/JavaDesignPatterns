package com.strategy;

public class WalkAndFlyStrategy implements MovementStrategy {

    @Override
    public void move() {
        System.out.println("Walk or Fly");
    }
}
