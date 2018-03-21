package com.gefa.ekf.boundary.outbound.async.fit;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.gefa.ekf.application.domain.events.EmailSentEvent;

@ApplicationScoped
public class EmailEventServiceAdapter {

	@Inject
	private EmailEventTranslater emailEventTranslater;

	@Inject
	private JMSFacade jmsBinding;

	public void sendEmail(EmailSentEvent emailSentEvent) {
		jmsBinding.sendEmail(emailEventTranslater.toEmailEvent(emailSentEvent));
	}

}
