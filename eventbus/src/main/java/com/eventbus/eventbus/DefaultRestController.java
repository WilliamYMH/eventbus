package com.eventbus.eventbus;

import com.google.common.eventbus.EventBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class DefaultRestController {

    @Autowired
    private EventBus eventbus;

    @GetMapping()
    public void event1(@RequestParam(value = "message", defaultValue = "Hello World!") String message) {
        Event event = new Event(message);
        eventbus.post(event);
    }

    @PostMapping()
    public void event2(@RequestParam(value = "message", defaultValue = "Hello World!") String message) {
        Event2 event = new Event2(message);
        eventbus.post(event);
    }
}