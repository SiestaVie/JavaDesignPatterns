package com.flyweight;

public class BacteriumTransformation implements ReproductionAbility{
    @Override
    public void breed() {
        System.out.println("Transformation");
    }
}
