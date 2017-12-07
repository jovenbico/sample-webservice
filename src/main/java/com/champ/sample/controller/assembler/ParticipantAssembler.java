package com.champ.sample.controller.assembler;

import org.springframework.stereotype.Component;

import com.champ.sample.controller.resource.ParticipantResource;
import com.champ.sample.model.Participant;

@Component
public class ParticipantAssembler extends Assempler<Participant, ParticipantResource> {

	@Override
	public ParticipantResource toResource(Participant model) {

		ParticipantResource r = new ParticipantResource();

		r.setId(model.getId());
		r.setName(model.getName());

		return r;
	}

}
