package com.gefa.ekf.boundary.inbound.rest.representations;

import java.util.Arrays;

import com.gefa.ekf.application.domain.Email;

public class EmailRepresentation extends Representation {

	private Long id;
	private String toAddress;
	private String fromAddress;
	private String subject;
	private String body;

	public EmailRepresentation() {

	}

	public EmailRepresentation(Email email, Link... links) {
		this.id = email.getId();
	    this.toAddress = email.getToAddress();
		this.fromAddress = email.getFromAddress();
		this.subject = email.getSubject();
		this.body = email.getBody();
		this.links = Arrays.asList(links);

	}

	public EmailRepresentation(Long id, String toAddress, String fromAddress, String subject, String body) {
		this.id = id;
		this.toAddress = toAddress;
		this.fromAddress = fromAddress;
		this.subject = subject;
		this.body = body;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getToAddress() {
		return toAddress;
	}

	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}

	public String getFromAddress() {
		return fromAddress;
	}

	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}
