package com.chainOfResponsibility.typesOfPayments;

import com.chainOfResponsibility.RequestActions;
import com.chainOfResponsibility.Transaction;

public class CommonType {
    private RequestActions requestActions;

    public CommonType() {
        requestActions = new Transaction();
    }

    public void startTransaction() {
        requestActions.fulfillRequest(requestActions);
    }
}
