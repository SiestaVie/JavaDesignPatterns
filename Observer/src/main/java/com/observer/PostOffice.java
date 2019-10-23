package com.observer;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class PostOffice {
    private List<Subscriber> subscriberMagazines;
    private List<Subscriber> subscriberNewspapers;
    private static final Logger LOG = Logger.getLogger(PostOffice.class);

    public PostOffice() {
        subscriberMagazines = new ArrayList<>();
        subscriberNewspapers = new ArrayList<>();
    }

    public void addSubscriberMagazines(Subscriber sub) {
        subscriberMagazines.add(sub);
    }

    public void removeSubscriberMagazines(Subscriber sub) {
        subscriberMagazines.remove(sub);
    }

    public void addSubscriberNewspapers(Subscriber sub) {
        subscriberNewspapers.add(sub);
    }

    public void removeSubscriberNewspapers(Subscriber sub) {
        subscriberNewspapers.remove(sub);
    }

    public void getPublishing(String publishing) {
        PublishingHouse publishingHouse;
        if (publishing.equalsIgnoreCase("NEWSPAPER")) {
            publishingHouse = PublishingHouse.NEWSPAPER;
            notifySubscribers(publishingHouse);
        } else if (publishing.equalsIgnoreCase("MAGAZINE")) {
            publishingHouse = PublishingHouse.MAGAZINE;
            notifySubscribers(publishingHouse);
        } else {
            LOG.error("There is no more variants");
        }
    }


    private void notifySubscribers(PublishingHouse publishingHouse) {
        switch (publishingHouse) {
            case NEWSPAPER:
                for (Subscriber sub : subscriberNewspapers) {
                    sub.update(publishingHouse);
                }
                System.out.println("All subscribers of newspaper have been informed");
                break;
            case MAGAZINE:
                for (Subscriber sub : subscriberMagazines) {
                    sub.update(publishingHouse);
                }
                System.out.println("All subscribers of magazine have been informed");
                break;
        }
    }
}
