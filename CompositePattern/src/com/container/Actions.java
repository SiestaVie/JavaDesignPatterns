package com.container;

public abstract class Actions implements Expression {
    public Expression first;
    public Expression second;

    public Actions(Expression first, Expression second) {
        this.first = first;
        this.second = second;
    }
}
