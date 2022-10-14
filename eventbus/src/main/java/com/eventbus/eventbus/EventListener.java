package com.eventbus.eventbus;

import com.google.common.eventbus.Subscribe;

public class EventListener {
 
    @Subscribe
    public void onEvent(Event event) {
        System.out.printf("Event1: %s%n", event.getMessage());
    }
}