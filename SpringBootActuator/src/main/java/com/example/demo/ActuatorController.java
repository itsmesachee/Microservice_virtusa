package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActuatorController {
	
	@RequestMapping("/actuator/{name}")
	public String getMessage(@PathVariable String name) {
		return name;
		
	}

}
