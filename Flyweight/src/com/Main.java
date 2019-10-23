package com;

import com.flyweight.BacterialColonyBreedingProcessAccountingSystem;

/**
 * Flyweight pattern. To develop a system for recording the processes of reproduction of a colony of bacteria.
 */


public class Main {
    public static void main(String[] args) {
        BacterialColonyBreedingProcessAccountingSystem breedSystem = new BacterialColonyBreedingProcessAccountingSystem();
        breedSystem.enumerate();
    }
}
