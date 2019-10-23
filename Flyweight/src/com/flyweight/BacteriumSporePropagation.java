package com.flyweight;

public class BacteriumSporePropagation implements ReproductionAbility{
    @Override
    public void breed() {
        System.out.println("Spore Propagation");
    }
}
