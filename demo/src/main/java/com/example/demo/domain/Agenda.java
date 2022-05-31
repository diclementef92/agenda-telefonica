package com.example.demo.domain;

import java.util.LinkedList;
import java.util.List;

public class Agenda {
	private String utente;

	private String nome;

	private List<Contatto> contatti;
	
	public Agenda(String nome, String utente) {
		this.utente = utente;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUtente() {
		return utente;
	}

	public void setUtente(String utente) {
		this.utente = utente;
	}

	public List<Contatto> getContatti() {
		return contatti;
	}

	public void setContatti(LinkedList<Contatto> contatti) {
		this.contatti = contatti;
	}

}
