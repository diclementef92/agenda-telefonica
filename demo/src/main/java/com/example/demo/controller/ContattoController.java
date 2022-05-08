package com.example.demo.controller;

import java.util.LinkedList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Contatto;
import com.example.demo.repository.ContattoRepository;
import com.example.demo.service.ContattoService;

@RestController
public class ContattoController {
	
	private final ContattoService contattoService;
	
	public ContattoController(ContattoService contattoService) {
		this.contattoService = contattoService;

	}
	
	@GetMapping("/contatti")
	public ResponseEntity<LinkedList<Contatto>> listaContatti () {

		return new ResponseEntity<>(contattoService.listaContatti(),HttpStatus.OK);
		
		
	}
	
	@GetMapping("/contatti/{id}")
	public ResponseEntity<Contatto> contattoById(@PathVariable String id) {
		Integer num = Integer.parseInt(id);
		Contatto c = contattoService.getContattoById(num);
		if(c != null) {
			return new ResponseEntity<>(c,HttpStatus.OK);
		}
		return new ResponseEntity<>(c,HttpStatus.NOT_FOUND);
		
	}
	
	
	@PostMapping("/aggiungiContatto")
	public ResponseEntity<Contatto> aggiungiContatto(@RequestBody Contatto contatto) {
		//TODO: completare con i service
		
		return new ResponseEntity<>(contatto, HttpStatus.CREATED);
		
	}
	
	@PutMapping("/modificaContatto/{id}")
	public Contatto modificaContatto(@PathVariable String id, @RequestBody Contatto contatto) {
		//TODO: completare con i service
		                                                                                                                                                                                                                                                                                                            
		return contatto;
	}


	@DeleteMapping("/eliminaContatto/{id}")
	public void eliminaContatto(@PathVariable Integer id) {
		
	}
	
	

	

}
