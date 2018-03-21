package com.gefa.ekf.application;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.gefa.ekf.application.domain.Email;
import com.gefa.ekf.application.domain.events.EmailSentEvent;
import com.gefa.ekf.application.domain.events.DomainEvent;
import com.gefa.ekf.application.domain.repositories.MapEmailRepository;
import com.gefa.ekf.application.exceptions.EmailException;
import com.gefa.ekf.application.infrastructure.DomainEventsDispatcher;

@ApplicationScoped
public class EmailService {

    @Inject
    private MapEmailRepository emailRepository;

    @Inject
    private DomainEventsDispatcher domainEventsDispatcher;

    public Long send(Email email) {

        Long emailId;
        try {
            emailId = emailRepository.saveEmail(email);
            email.addDomainEvent(new EmailSentEvent(email));
            for (DomainEvent domainEvent : email.getDomainEvents()) {
                domainEventsDispatcher.dispatch(domainEvent);
            }
        } catch (Exception e) {
            throw new EmailException();
        }

        return emailId;
    }

    public Email getEmail(Long emailId) {

        return emailRepository.getEmail(emailId);
    }

}
