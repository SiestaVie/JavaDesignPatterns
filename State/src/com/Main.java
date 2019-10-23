package com;

import com.state.GrantTraining;

/**
 * State pattern. An order for a grant training can be in several states: created, considered, pending, rejected,
 * confirmed, withdrawn, etc. Define the logic of state changes and develop a system model.
 */

public class Main {
    public static void main(String[] args) {
        GrantTraining grantTraining = new GrantTraining();
        grantTraining.timePasses();
        grantTraining.timePasses();
    }
}
