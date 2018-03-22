package com.champ.sample.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.champ.sample.controller.resource.MessageResource;

@RestController
public class HelloController {

	@GetMapping(value = "/hello", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public MessageResource say() {

		MessageResource resource = new MessageResource("Hello World!");
		return resource;

	}

}
