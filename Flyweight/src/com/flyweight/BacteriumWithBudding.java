package com.flyweight;

public class BacteriumWithBudding implements ReproductionAbility {


    @Override
    public void breed() {
        System.out.println("Budding");
    }
}
