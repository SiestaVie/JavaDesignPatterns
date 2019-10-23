package com.chainOfResponsibility.typesOfPayments;

import com.chainOfResponsibility.RequestActions;
import com.chainOfResponsibility.Transaction;

public class IntraBank {
    private RequestActions requestActions;

    public IntraBank() {
        requestActions = new Transaction();
    }

    public void startTransaction() {
        requestActions.fulfillRequest(requestActions);
    }
}
