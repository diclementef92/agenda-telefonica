package com.example.demo.domain;

public class Contatto {
	
	//create sequence
	private Integer id; 
	
	private String nome;
	
	private String cognome;
	
	private String  telefono;

	public Contatto(String nome, String cognome, String telefono) {
		
		this.setNome(nome);
		this.setCognome(cognome);
		this.setTelefono(telefono);
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public String getTelefono() {
		return telefono;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
}
