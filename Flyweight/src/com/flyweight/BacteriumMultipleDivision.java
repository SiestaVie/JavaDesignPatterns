package com.flyweight;

public class BacteriumMultipleDivision implements ReproductionAbility {
    @Override
    public void breed() {
        System.out.println("Multiple Division");
    }
}
