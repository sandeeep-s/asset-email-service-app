package com.gefa.ekf.boundary.outbound.async.fit.domain;

import com.gefa.ekf.boundary.AbstractTransferObject;

public class EmailEvent extends AbstractTransferObject {

	private String toAddress;
	private String fromAddress;
	private String subject;
	private String body;

	public EmailEvent(){

    }

	public EmailEvent(String toAddress, String fromAddress, String subject, String body) {
		this.toAddress = toAddress;
		this.fromAddress = fromAddress;
		this.subject = subject;
		this.body = body;
	}

	public String getToAddress() {
		return toAddress;
	}

	public String getFromAddress() {
		return fromAddress;
	}

	public String getSubject() {
		return subject;
	}

	public String getBody() {
		return body;
	}
}