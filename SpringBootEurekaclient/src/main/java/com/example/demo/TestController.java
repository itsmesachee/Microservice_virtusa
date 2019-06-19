package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/eurekaClient/{name}")
	public String getHelloWorld (@PathVariable String name)
	{
	return "HI "+name;
	}
	}