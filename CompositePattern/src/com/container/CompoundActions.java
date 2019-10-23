package com.container;

import java.util.ArrayList;
import java.util.List;

public class CompoundActions implements Expression {
    private List<Expression> container = new ArrayList<>();

    public void addComponent(Expression expression) {
        container.add(expression);
    }

    public void removeComponent(Expression expression) {
        container.remove(expression);
    }

    @Override
    public int act() {
        int result = 0;
        for (Expression component : container) {
            result = component.act();
        }
        return result;
    }
}
