package org.ifa.smith.steakos.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HelloController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello world from controller !";
	}
	
}