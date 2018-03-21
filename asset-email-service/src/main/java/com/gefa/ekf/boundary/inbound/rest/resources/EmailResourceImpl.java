package com.gefa.ekf.boundary.inbound.rest.resources;

import javax.inject.Inject;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

import com.gefa.ekf.boundary.inbound.rest.activities.SendEmailActivity;
import com.gefa.ekf.boundary.inbound.rest.representations.EmailRepresentation;

public class EmailResourceImpl implements EmailResource {

	@Inject
	private SendEmailActivity sendEmailActivity;

	@Context
	UriInfo uriInfo;

	public Response sendEmail(EmailRepresentation emailRepresentation) {
		try{
		    System.out.println("emailRepresentation="+emailRepresentation);
			EmailRepresentation responseRepresentation = sendEmailActivity.sendEmail(emailRepresentation, uriInfo);
			ResponseBuilder builder = Response.status(Status.CREATED).type(MediaType.APPLICATION_JSON)
					.entity(responseRepresentation);

			return builder.build();

		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
	}

}
