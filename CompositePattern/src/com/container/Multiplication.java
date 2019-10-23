package com.container;

public class Multiplication extends Actions {

    public Multiplication(Expression first, Expression second) {
        super(first, second);
    }


    @Override
    public int act() {
        return first.act() * second.act();
    }
}
