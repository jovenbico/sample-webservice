package com.champ.sample.model;

public class Participant extends BaseModel {

	private Long id;
	private String name;
	private String email;

	public Participant() {
		this(null, null);
	}

	public Participant(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
