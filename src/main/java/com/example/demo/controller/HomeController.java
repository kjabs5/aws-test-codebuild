package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "welcome kishor"
				+ "";
	}
	
	
	@RequestMapping("/home")
	public String home1() {
		return "welcome Youtube"
				+ "";
	}

}
