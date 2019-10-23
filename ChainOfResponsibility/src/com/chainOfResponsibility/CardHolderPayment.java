package com.chainOfResponsibility;

public class CardHolderPayment extends RequestActions {


    @Override
    public void fulfillRequest(RequestActions action) {
        if (action.getRequestOptions().equals(RequestOptions.CONFIRMED)) {
            this.setRequestOptions(RequestOptions.CONFIRMED);
            System.out.println("The card holder reimburses the issuing bank for the costs of services and goods purchased in the TSC.");
        }
    }
}
