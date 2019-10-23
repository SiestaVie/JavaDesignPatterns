package com.container;

public class Digit implements Expression {
    private int digit;

    public Digit(int digit) {
        this.digit = digit;
    }

    @Override
    public int act() {
        return digit;
    }
}
