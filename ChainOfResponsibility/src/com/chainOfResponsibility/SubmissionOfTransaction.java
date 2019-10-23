package com.chainOfResponsibility;

import java.util.Random;

public class SubmissionOfTransaction extends RequestActions {


    @Override
    public void fulfillRequest(RequestActions action) {
        if (action.getRequestOptions().equals(RequestOptions.CONFIRMED)) {
            System.out.println("The acquirer submits the transaction for consideration to the issuing bank for payment " +
                    "through the mutual settlement system of the selected payment system.");
            int numb = getRandomNumb();
            if (numb == 1) {
                System.err.println("The Submission Of Transaction was denied. Issuing bank has denied the request");
                this.setRequestOptions(RequestOptions.DENIED);
            } else {
                System.out.println("The Submission Of Transaction confirmed");
                this.setRequestOptions(RequestOptions.CONFIRMED);
                new PaymentByTheIssuingBank().fulfillRequest(this);

            }
        }
    }

    private int getRandomNumb() {
        Random random = new Random();
        return random.ints(1, (3 + 1)).findFirst().getAsInt();
    }
}
