package com.gefa.ekf.boundary.inbound.rest.activities;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.core.UriInfo;

import com.gefa.ekf.application.EmailService;
import com.gefa.ekf.application.domain.Email;
import com.gefa.ekf.boundary.inbound.rest.representations.EmailRepresentation;
import com.gefa.ekf.boundary.inbound.rest.representations.converters.EmailConverter;

@ApplicationScoped
public class SendEmailActivity {

	@Inject
	private EmailService emailService;

	@Inject
	private EmailConverter emailConverter;

	public SendEmailActivity() {

	}

	public EmailRepresentation sendEmail(EmailRepresentation emailRepresentation, UriInfo uriInfo) {

		Email email = emailConverter.toEmail(emailRepresentation);
		Long emailId = emailService.send(email);

		return new EmailRepresentation(email);
	}

}
