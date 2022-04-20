package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.HomeService;

@RestController
public class HomeController {
	
	private final HomeService homeService;
	
	public HomeController (HomeService homeService) {
		this.homeService = homeService;
	}
	
	
	@GetMapping(value = {"/","/home"})
	public String home() {
		return "Welcome to my project";
	}

}
