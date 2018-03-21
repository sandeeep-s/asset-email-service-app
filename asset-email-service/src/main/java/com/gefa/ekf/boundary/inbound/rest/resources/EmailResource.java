package com.gefa.ekf.boundary.inbound.rest.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.gefa.ekf.boundary.inbound.rest.representations.EmailRepresentation;

@Path("/email")
@Api(value = "emails")
@SwaggerDefinition(tags = { @Tag(name = "emails", description = "Operations on emails.") })
public interface EmailResource {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Create an asset", notes = "Send email")
	@ApiResponses(@ApiResponse(code = 200, message = "Email has been created"))
	Response sendEmail(EmailRepresentation emailRepresentation);

}
