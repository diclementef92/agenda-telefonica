package com.example.demo.exception;

import com.example.demo.domain.Contatto;

public class ContattoException extends Exception {

	private String message;

	private Contatto contatto;

	public ContattoException (String m,Contatto c) {
		this.contatto = c;
		this.message = m;
		
	}
	
	public ContattoException (String m) {
		this.message = m;
		
	}
	
	public String getMessage() {
		return message;
	}

	public Contatto getContatto() {
		return contatto;
	}
}
