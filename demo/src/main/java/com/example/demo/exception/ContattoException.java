package com.example.demo.exception;

import com.example.demo.domain.Contatto;

public class ContattoException extends Exception {

	private static final long serialVersionUID = -6313123886849911204L;

	private String message = "ContattoException: ";

	private Contatto contatto;

	public ContattoException (String m,Contatto c) {
		this.contatto = c;
		this.message += m;
		
	}
	
	public ContattoException (String m) {
		this.message += m;
		
	}
	
	public String getMessage() {
		return message;
	}

	public Contatto getContatto() {
		return contatto;
	}
}
