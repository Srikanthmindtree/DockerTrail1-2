package com.example.demo.Controller1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/list")
	public String ok()
	{
		return "night iyndi mari em leda";
	}

}
