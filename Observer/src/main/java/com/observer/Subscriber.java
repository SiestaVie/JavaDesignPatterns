package com.observer;

public class Subscriber implements AbleToSubscribe{

    public Subscriber() {
    }

    @Override
    public void update(PublishingHouse publishingHouse) {
        switch (publishingHouse) {
            case NEWSPAPER:
                System.out.println("Got NEWSPAPER");
                break;
            case MAGAZINE:
                System.out.println("Got MAGAZINE");
                break;
        }
    }
}
