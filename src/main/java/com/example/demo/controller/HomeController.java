package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "welcome to codebuild";
	}
	
	@RequestMapping("/home")
	public String homeadd() {
		return "welcome kishor to your home";
	}

}
