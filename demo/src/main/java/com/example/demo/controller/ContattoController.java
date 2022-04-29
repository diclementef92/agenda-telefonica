package com.example.demo.controller;

import java.util.LinkedList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Contatto;
import com.example.demo.service.ContattoService;

@RestController
public class ContattoController {
	
	@PostMapping("/aggiungiContatto")
	public ResponseEntity<Contatto> aggiungiContatto(@RequestBody Contatto contatto) {
		//TODO: completare con i service
		return new ResponseEntity<>(contatto, HttpStatus.CREATED);
		
	}
	
	@PutMapping(value = "/modificaContatto/{id}")
	public Contatto modificaContatto(@PathVariable String id, @RequestBody Contatto contatto) {
		//TODO: completare con i service
		
		return contatto;
	}


	
	public void eliminaContatto(int idContatto) {
		
	}
	
	
	public LinkedList<Contatto> ricerca() {
		
		
		return null;
		
	}
	

}
