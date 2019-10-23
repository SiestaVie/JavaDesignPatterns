package com.observer;

@FunctionalInterface
public interface AbleToSubscribe {
    void update(PublishingHouse publishingHouse);
}
