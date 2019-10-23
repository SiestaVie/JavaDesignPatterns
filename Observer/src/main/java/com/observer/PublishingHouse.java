package com.observer;

public enum PublishingHouse {
    NEWSPAPER,
    MAGAZINE;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
