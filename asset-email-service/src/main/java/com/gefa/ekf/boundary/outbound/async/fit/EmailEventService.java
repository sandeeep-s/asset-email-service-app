package com.gefa.ekf.boundary.outbound.async.fit;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.gefa.ekf.application.domain.events.EmailSentEvent;

@ApplicationScoped
public class EmailEventService {

	@Inject
	private EmailEventServiceAdapter emailEventServiceAdapter;

	public void sendEmail(EmailSentEvent emailSentEvent) {

		emailEventServiceAdapter.sendEmail(emailSentEvent);
	}

}
