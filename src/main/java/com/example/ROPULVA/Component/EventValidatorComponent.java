package com.example.ROPULVA.Component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class EventValidatorComponent {
	
	private static final Logger logger = (Logger) LoggerFactory.getLogger(EventValidatorComponent.class);

    public void logEventAction(String action, Long eventId) {
        logger.info("Action: {} for Event ID: {}", action, eventId);
    }

    public void validateEventData(String title, String description) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Event title cannot be empty.");
        }

        if (description == null || description.isEmpty()) {
            throw new IllegalArgumentException("Event description cannot be empty.");
        }
    }

}
