package com.example.demo.service;

import java.util.LinkedList;

import org.springframework.stereotype.Service;

import com.example.demo.repository.ContattoRepository;
import com.example.demo.domain.Contatto;;


@Service
public class ContattoService {
	private final ContattoRepository contattoRepository;
	
	public ContattoService (ContattoRepository contattoRepository) {
		this.contattoRepository = contattoRepository;
	}
	
	public LinkedList<Contatto> listaContatti(){
		return contattoRepository.listaContatti();
	}
	
	public Contatto getContattoById(Integer id) {
		Contatto contatto= contattoRepository.getContattoById(id) ;
		return contatto;

	}
}
