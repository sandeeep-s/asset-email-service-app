package com.gefa.ekf.boundary.outbound.async.fit;

import com.gefa.ekf.application.domain.Email;
import com.gefa.ekf.application.domain.events.EmailSentEvent;
import com.gefa.ekf.boundary.outbound.async.fit.domain.EmailEvent;

public class EmailEventTranslater {

	public EmailEvent toEmailEvent(EmailSentEvent emailSentEvent) {

		return new EmailEvent();
	}

	public Email fromEmailEvent(EmailEvent emailEvent) {

		return null;
	}

}
