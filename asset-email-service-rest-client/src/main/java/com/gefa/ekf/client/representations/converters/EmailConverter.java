package com.gefa.ekf.client.representations.converters;


import com.gefa.ekf.client.domain.Email;
import com.gefa.ekf.client.representations.EmailRepresentation;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EmailConverter {

    public Email toEmail(EmailRepresentation emailRepresentation) {

        return new Email(emailRepresentation.getId(),
                emailRepresentation.getToAddress(), emailRepresentation.getFromAddress(), emailRepresentation.getSubject(), emailRepresentation.getBody());

    }


    public EmailRepresentation fromEmail(Email email) {

        return new EmailRepresentation(email);
    }

}
