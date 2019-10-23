package com.container;

public class Substruction extends Actions {

    public Substruction(Expression first, Expression second) {
        super(first, second);
    }


    @Override
    public int act() {
        return first.act() - second.act();
    }
}
