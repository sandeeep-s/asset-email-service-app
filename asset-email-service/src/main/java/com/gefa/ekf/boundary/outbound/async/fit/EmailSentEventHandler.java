package com.gefa.ekf.boundary.outbound.async.fit;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.gefa.ekf.application.domain.events.EmailSentEvent;
import com.gefa.ekf.application.domain.events.DomainEvent;
import com.gefa.ekf.application.domain.events.handlers.DomainEventHandler;

@ApplicationScoped
public class EmailSentEventHandler implements DomainEventHandler {

	@Inject
	private EmailEventService emailEventService;

	@Override
	public void handle(DomainEvent emailSentEvent) {

			emailEventService.sendEmail((EmailSentEvent)emailSentEvent);
	}

}
