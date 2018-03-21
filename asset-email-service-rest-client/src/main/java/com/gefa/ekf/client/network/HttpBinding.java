package com.gefa.ekf.client.network;

import com.gefa.ekf.client.exceptions.*;
import com.gefa.ekf.client.representations.EmailRepresentation;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;

public class HttpBinding {

    public EmailRepresentation sendEmail(EmailRepresentation EmailRepresentation, URI emailURI)
            throws MalformedEmailException, ServiceFailureException {

        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(emailURI);

        Response response = target.request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(EmailRepresentation, MediaType.APPLICATION_JSON));

        int status = response.getStatus();

        if (status == 400) {
            throw new MalformedEmailException();
        } else if (status == 500) {
            throw new ServiceFailureException();
        } else if (status == 201) {
            return response.readEntity(EmailRepresentation.class);
        }

        throw new RuntimeException(String.format("Unexpected response [%d] while creating asset resource [%s]", status,
                emailURI.toString()));

    }

}
