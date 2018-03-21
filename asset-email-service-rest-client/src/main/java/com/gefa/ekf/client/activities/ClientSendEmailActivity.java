package com.gefa.ekf.client.activities;

import com.gefa.ekf.client.domain.Email;
import com.gefa.ekf.client.exceptions.MalformedEmailException;
import com.gefa.ekf.client.exceptions.ServiceFailureException;
import com.gefa.ekf.client.representations.EmailRepresentation;
import com.gefa.ekf.client.representations.converters.EmailConverter;

import java.net.URI;

public class ClientSendEmailActivity extends Activity {

	private Email email;

	private EmailConverter emailConverter = new EmailConverter();

	public void sendEmail(Email email, URI emailURI) {

		try {
			EmailRepresentation emailRepresentation = httpBinding.sendEmail(emailConverter.fromEmail(email), emailURI);
			this.email = emailConverter.toEmail(emailRepresentation);
			this.actions = new RepresentationHypermediaProcessor()
					.extractNextActionsFromEmailRepresentation(emailRepresentation);

		} catch (MalformedEmailException e) {
			e.printStackTrace();
		} catch (ServiceFailureException e) {
			e.printStackTrace();
		}

	}

	public Email getEmail() {
		return email;
	}

}
