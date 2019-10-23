package com.container;

public class Division extends Actions {

    public Division(Expression first, Expression second) {
        super(first, second);
    }


    @Override
    public int act() {
        return first.act() / second.act();
    }
}
