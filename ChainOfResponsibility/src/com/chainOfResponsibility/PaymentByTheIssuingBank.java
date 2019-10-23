package com.chainOfResponsibility;

public class PaymentByTheIssuingBank extends RequestActions {


    @Override
    public void fulfillRequest(RequestActions action) {
        if (action.getRequestOptions().equals(RequestOptions.CONFIRMED)) {
            System.out.println("The issuing bank, through the (for instance Mastercard, or Apple Pay) settlement system, pays the acquirer the required amount minus the transaction fee");
            System.out.println("The Payment By The Issuing Bank has been confirmed");
            this.setRequestOptions(RequestOptions.CONFIRMED);
            new CardHolderPayment().fulfillRequest(this);
        }
    }

}
