package com.container;

public class Addition extends Actions {

    public Addition(Expression first, Expression second) {
        super(first, second);
    }

    @Override
    public int act() {
        return first.act() + second.act();
    }
}
