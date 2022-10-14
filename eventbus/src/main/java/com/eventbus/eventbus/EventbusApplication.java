package com.eventbus.eventbus;

import com.google.common.eventbus.EventBus;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EventbusApplication {

	@Bean
	public EventBus eventBus() {
		EventBus eventbus = new EventBus();
		eventbus.register(new EventListener());
		return eventbus;
	}

	public static void main(String[] args) {
		SpringApplication.run(EventbusApplication.class, args);
	}

}
