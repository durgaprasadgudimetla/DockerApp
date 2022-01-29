package com.dockerspringboot.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {

	@GetMapping("/login")
	public String userLogin() {
		return "hello user";
	}

}
