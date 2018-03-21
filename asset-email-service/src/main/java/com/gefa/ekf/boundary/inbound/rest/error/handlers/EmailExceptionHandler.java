package com.gefa.ekf.boundary.inbound.rest.error.handlers;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.gefa.ekf.application.exceptions.EmailException;
import com.gefa.ekf.boundary.inbound.rest.error.ErrorCodeNum;
import com.gefa.ekf.boundary.inbound.rest.error.GeneralErrorCode;

@Provider
public class EmailExceptionHandler implements ExceptionMapper<EmailException> {

	@Override
	public Response toResponse(EmailException exception) {
		return Response.status(Status.NOT_FOUND)
				.entity(new GeneralErrorCode(String.valueOf(Status.NOT_FOUND),
						ErrorCodeNum.RESOORCE_NOT_FOUND.getUserMessage(), exception.getLocalizedMessage().toString()))
				.build();
	}

}
