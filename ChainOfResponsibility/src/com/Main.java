package com;

import com.chainOfResponsibility.typesOfPayments.CommonType;
import com.chainOfResponsibility.typesOfPayments.IntraBank;

/**
 * Chain of responsibility pattern. The passage of the payment through the banking system is accompanied by a number of actions:
 * fixation, controlling, removing the percentage of the bank and other deductions and actions.
 * Build chains for various types of payments (common, preferential, state, intra-bank) in accordance with the
 * subject area and develop a system model.
 */

public class Main {
    public static void main(String[] args) {
        CommonType commonType = new CommonType();
        commonType.startTransaction();
        IntraBank intraBank = new IntraBank();
        //intraBank.startTransaction();
    }
}
