package com.chainOfResponsibility;

import java.util.Random;

public class Authentication extends RequestActions {


    @Override
    public void fulfillRequest(RequestActions action) {
        if (action.getRequestOptions().equals(RequestOptions.CONFIRMED)) {
            System.out.println("Checking needed amount of money");
            int numb = getRandomNumb();
            if (numb == 1) {
                this.setRequestOptions(RequestOptions.DENIED);
                System.err.println("Authentication Operation was denied. Not enough money in the account");
            } else {
                System.out.println("Authentication Operation was confirmed");
                this.setRequestOptions(RequestOptions.CONFIRMED);
                new SubmissionOfTransaction().fulfillRequest(this);
            }
        }
    }

    private int getRandomNumb() {
        Random random = new Random();
        return random.ints(1, (3 + 1)).findFirst().getAsInt();
    }

}
