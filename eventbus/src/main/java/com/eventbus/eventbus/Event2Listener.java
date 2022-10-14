package com.eventbus.eventbus;

import com.google.common.eventbus.Subscribe;

public class Event2Listener {
 
    @Subscribe
    public void onEvent(Event2 event2) {
        System.out.printf("Event2: %s%n", event2.getMessage());
    }
}