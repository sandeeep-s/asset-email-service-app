package com.gefa.ekf.application.domain.repositories;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Singleton;

import com.gefa.ekf.application.domain.Email;

@Singleton
public class MapEmailRepository implements EmailRepository {

	private Map<Long, Email> backingStore = new HashMap<Long, Email>();

	public Email delete(Long id) {
		Email email = backingStore.remove(id);
		return email;
	}

	@Override
	public Long saveEmail(Email email) {
		int size = backingStore.size();
		Long id = Long.valueOf(size + 1);
		backingStore.put(id, email);
		return id;

	}

	@Override
	public Email getEmail(Long assetId) {
		return backingStore.get(assetId);
	}

}
