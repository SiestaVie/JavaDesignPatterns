package com;

import com.container.*;

/**
 * Write a calculator, to the input of which an expression of the form (1 + 2) * 4 + 5 * (3 + 6) is supplied,
 * the output should be the value of this expression. Use the Composite pattern.
 */


public class Main {
    public static void main(String[] args) {
        System.out.println(compose());
        System.out.println(useCompoundActions());//with the container component class
    }

    private static int compose() {
        Expression expression = new Addition(
                new Multiplication(new Addition(new Digit(1), new Digit(2)), new Digit(4)),
                new Multiplication(new Digit(5), new Addition(new Digit(3), new Digit(6))));
        return expression.act();
    }

    private static int useCompoundActions() {
        CompoundActions compoundActions1 = new CompoundActions();
        CompoundActions compoundActions2 = new CompoundActions();
        compoundActions1.addComponent(new Multiplication(new Addition(new Digit(1), new Digit(2)), new Digit(4)));
        compoundActions2.addComponent(new Multiplication(new Digit(5), new Addition(new Digit(3), new Digit(6))));
        return new Addition(new Digit(compoundActions1.act()), new Digit(compoundActions2.act())).act();
    }

}
