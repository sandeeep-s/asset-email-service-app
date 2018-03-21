package com.gefa.ekf.boundary.inbound.rest.representations.converters;

import com.gefa.ekf.application.domain.Email;
import com.gefa.ekf.boundary.inbound.rest.representations.EmailRepresentation;
import com.gefa.ekf.boundary.inbound.rest.representations.Link;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EmailConverter {

    public Email toEmail(EmailRepresentation emailRepresentation) {

        System.out.println("EmailConverter emailRepresentation="+emailRepresentation);


        System.out.println("emailRepresentation.getId()="+emailRepresentation.getId());
        System.out.println("emailRepresentation.getToAddress()="+emailRepresentation.getToAddress());
        System.out.println("emailRepresentation.getFromAddress()="+emailRepresentation.getFromAddress());
        System.out.println("emailRepresentation.getBody()="+emailRepresentation.getBody());
        Email email = new Email(emailRepresentation.getId(), emailRepresentation.getToAddress(), emailRepresentation.getFromAddress(), emailRepresentation.getSubject(), emailRepresentation.getBody());
        return email;

    }


    public EmailRepresentation fromAsset(Email email, Link... links) {

        return new EmailRepresentation(email, links);
    }

}
