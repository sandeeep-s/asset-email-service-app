package com.gefa.ekf.boundary.inbound.async.fit;

import com.gefa.ekf.application.EmailService;
import com.gefa.ekf.application.domain.Email;
import com.gefa.ekf.application.domain.repositories.EmailRepository;
import com.gefa.ekf.boundary.inbound.async.fit.domain.FITAssetEvent;

public class ProcessFITAssetEventActivity {

	private EmailService emailService;

	private EmailRepository emailRepository;

	public void create(FITAssetEvent fitAssetEvent) {

	}

	private Email createAssetFromEvent(FITAssetEvent fitAssetEvent) {
		return new Email();
	}

	private Email updateAssetFromEvent(Email email, FITAssetEvent fitAssetEvent) {
		return email;
	}
}
