package com.main.micro2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Micro2HomeController {
	@GetMapping(path = "/greet-m2")
	public String greet() {
		System.out.println("micro called");
		return "Greeting from micro-2";

	}
}
