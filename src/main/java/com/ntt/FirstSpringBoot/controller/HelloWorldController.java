package com.ntt.FirstSpringBoot.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloWorldController {
	private String message = "Hello World ! ";
	private String username = "SpringBoot Developer";
	
	@RequestMapping("/hello")
	public String welcome(Map<String, Object> model) { 
		model.put("message",this.message);
		model.put("name",this.username);
		return "helloworld";
	}
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
}
