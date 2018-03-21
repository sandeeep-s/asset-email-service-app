package com.gefa.ekf.domain;

import com.gefa.ekf.client.domain.Email;

import java.util.concurrent.ThreadLocalRandom;

public class TestEmailFactory {

	public Email createAsset() {
		int random = ThreadLocalRandom.current().nextInt(10000, 30000);

		String subject = "TestSubject-" + random;
		String toAddress = "exampletoaddress@nmail.com";
		String fromAddress = "examplefromaddress@nmail.com";
		String body = "Test Body";
		return new Email(toAddress, fromAddress, subject, body);

	}

}
