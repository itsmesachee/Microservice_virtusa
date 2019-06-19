package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootRestFullApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestFullApplication.class, args);
		//System.out.println("Welcome to first SpringBoot test ");
		System.out.println("Welcome to first SpringBoot test from command prompt");
	}

}


/*
 * @RestController
 * 
 * @RequestMapping("/first") class testController{
 * 
 * 
 * @RequestMapping("/message")
 * 
 * public String getMessage(String s) {
 * 
 * return "Message from controller getMessage method";
 * 
 * }
 * 
 * }
 */