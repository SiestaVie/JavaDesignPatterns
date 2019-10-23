package com.chainOfResponsibility;

public class Transaction extends RequestActions {


    @Override
    public void fulfillRequest(RequestActions action) {
        System.out.println("Transaction begins\n" +
                "You purchase a product or service from a trade and service company (TSC).");
        this.setRequestOptions(RequestOptions.CONFIRMED);
        System.out.println("Next operation is Authentication");
        new Authentication().fulfillRequest(this);
    }
}
