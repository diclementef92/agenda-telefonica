package com.example.demo.controller;

import java.util.List;

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
import com.example.demo.exception.ContattoException;
import com.example.demo.service.ContattoService;

@RestController
public class ContattoController {

	private final ContattoService contattoService;

	public ContattoController(ContattoService contattoService) {
		this.contattoService = contattoService;

	}

	@GetMapping("/contatti")
	public ResponseEntity<List<Contatto>> listaContatti() {

		return new ResponseEntity<>(contattoService.listaContatti(), HttpStatus.OK);

	}

	@GetMapping("/contatti/{id}")
	public ResponseEntity<?> contattoById(@PathVariable String id) {
		try {
			
			Integer num = Integer.parseInt(id);

			Contatto c = contattoService.getContattoById(num);
			return new ResponseEntity<>(c, HttpStatus.OK);

		} catch (ContattoException e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
		}

	}

	@PostMapping("/contatti")
	public ResponseEntity<Contatto> aggiungiContatto(@RequestBody Contatto contatto) {
		try {
			Contatto c = contattoService.addContatto(contatto);
			return new ResponseEntity<>(c, HttpStatus.OK);

		} catch (ContattoException e) {
			return new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
		}

	}
	//TODO: post di una lista contatti
	
	@PutMapping("/contatti/{id}")
	public ResponseEntity<?> modificaContatto(@PathVariable String id, @RequestBody Contatto contatto) {
		try {
			
			Integer num = Integer.parseInt(id);
	
			Contatto c = contattoService.modContatto(contatto, num);
			return new ResponseEntity<>(c,HttpStatus.CREATED);

		}catch(ContattoException | NumberFormatException e) {
			return new ResponseEntity<>(e.getMessage() + e.toString(),HttpStatus.NOT_MODIFIED);

		}

	}

	@DeleteMapping("/contatti/{id}")
	public ResponseEntity<Object> eliminaContatto(@PathVariable Integer id) {
		try {
			contattoService.eliminaContatto(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (ContattoException e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
		
		
	}

}
