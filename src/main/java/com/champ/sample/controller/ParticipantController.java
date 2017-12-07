package com.champ.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.champ.sample.controller.assembler.ParticipantAssembler;
import com.champ.sample.controller.resource.ParticipantResource;
import com.champ.sample.model.Participant;
import com.champ.sample.repository.ParticipantRepository;

@RestController
@RequestMapping(value = "/particpant", produces = { MediaType.APPLICATION_JSON_VALUE })
public class ParticipantController {

	@Autowired
	private ParticipantRepository repository;

	@Autowired
	private ParticipantAssembler assembler;

	@PostMapping
	public ResponseEntity<ParticipantResource> addParticipant( //
			@RequestBody Participant participant //
	) {

		repository.create(participant);
		return ResponseEntity.ok(assembler.toResource(participant));

	}

	@GetMapping
	public ResponseEntity<List<ParticipantResource>> getAllParticipant() {
		return ResponseEntity.ok(assembler.toResourceList(repository.getAll()));
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<ParticipantResource> getParticipant(//
			@PathVariable Long id //
	) {
		return ResponseEntity.ok(assembler.toResource(repository.read(id).get()));
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<Boolean> updateParticipant( //
			@PathVariable long id, //
			@RequestBody Participant participant //
	) {
		return ResponseEntity.ok(repository.update(id, participant));
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Boolean> deleteParticipant(//
			@PathVariable long id //
	) {
		return ResponseEntity.ok(repository.delete(id));
	}
}
