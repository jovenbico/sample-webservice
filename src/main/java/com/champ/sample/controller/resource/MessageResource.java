package com.champ.sample.controller.resource;

public class MessageResource {

	private String message;

	public MessageResource(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
