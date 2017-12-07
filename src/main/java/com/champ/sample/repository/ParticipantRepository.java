package com.champ.sample.repository;

import org.springframework.stereotype.Repository;

import com.champ.sample.model.Participant;

@Repository
public class ParticipantRepository extends InMemoryRepository<Participant> {

	@Override
	protected void updateIfExist(Participant original, Participant updated) {

		original.setName(updated.getName());
		original.setEmail(updated.getEmail());
	}

}
