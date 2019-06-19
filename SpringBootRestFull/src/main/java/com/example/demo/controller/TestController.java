package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonRawValue;


	@RestController
	@RequestMapping("/first")
	public	class TestController{
		
		
		@RequestMapping("/message1")
		public String getMessage(String s) {
			
			return "Hi Message from controller";
			
		}
		
}
