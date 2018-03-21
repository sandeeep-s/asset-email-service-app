package com.gefa.ekf.application.domain;

public class Email extends AggregateRoot {

    private Long id;
	private String toAddress;
	private String fromAddress;
	private String subject;
	private String body;

	public Email() {
	}

	public Email(String toAddress, String fromAddress, String subject, String body) {
		this.toAddress = toAddress;
		this.fromAddress = fromAddress;
		this.subject = subject;
		this.body = body;
	}

    public Email(Long id, String toAddress, String fromAddress, String subject, String body) {
        this.id = id;
        this.toAddress = toAddress;
        this.fromAddress = fromAddress;
        this.subject = subject;
        this.body = body;
    }

    public Long getId() {
        return id;
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
