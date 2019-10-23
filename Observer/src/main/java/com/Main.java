package com;

import com.observer.PostOffice;
import com.observer.Subscriber;

/**
 * Observer pattern. Design a Post Office system. Published newspapers and magazines come from the publishing
 * house to the post office. The post office sends the printed matter to the appropriate subscribers.
 */


public class Main {
    public static void main(String[] args) {
        PostOffice postOffice = new PostOffice();
        postOffice.addSubscriberMagazines(new Subscriber());
        postOffice.addSubscriberMagazines(new Subscriber());
        postOffice.addSubscriberNewspapers(new Subscriber());
        postOffice.getPublishing("NEWSPAPER");
        postOffice.getPublishing("MAGAZINE");
    }

}
