package com.example.demo.domain;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

//@Entity
public class Contatto {
	
	//@Id 
	//@GeneratedValue (strategy = GenerationType.SEQUENCE)
	//@Column (name = "ID")
	private Integer id; 
	
	private String nome;
	
	private String cognome;
	
	private String  telefono;

	public Contatto(Integer id,String nome, String cognome, String telefono) {
		
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.telefono = telefono;
	}
	
	public Integer getId() {
		return id;
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

