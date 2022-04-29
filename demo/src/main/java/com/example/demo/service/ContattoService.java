package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.repository.HomeRepository;

@Service
public class ContattoService {
	private final HomeRepository homeRepository;
	
	public ContattoService (HomeRepository homeRepository) {
		this.homeRepository = homeRepository;
	}
	
	
}
