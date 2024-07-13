package com.welcome.welcome.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
			
	@GetMapping ("/welcome")
	public String buscaar() {
		return "WelcomeeeeeeTetra!!";
	}	

}