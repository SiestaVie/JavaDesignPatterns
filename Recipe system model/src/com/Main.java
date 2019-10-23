package com;

import com.recipe.Prescription;

public class Main {
    public static void main(String[] args) {
        Prescription prescription = new Prescription();
        prescription.setDate(15);
        prescription.timePasses();
    }
}
