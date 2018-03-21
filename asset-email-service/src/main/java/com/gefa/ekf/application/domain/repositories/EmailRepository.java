package com.gefa.ekf.application.domain.repositories;

import com.gefa.ekf.application.domain.Email;

public interface EmailRepository {

	Long saveEmail(Email email);

	Email getEmail(Long emailId);

}
