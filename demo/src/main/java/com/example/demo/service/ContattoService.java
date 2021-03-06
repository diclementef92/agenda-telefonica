package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.repository.ContattoRepository;
import com.example.demo.domain.Contatto;
import com.example.demo.exception.ContattoException;;


@Service
public class ContattoService {
	private final ContattoRepository contattoRepository;
	
	public ContattoService (ContattoRepository contattoRepository) {
		this.contattoRepository = contattoRepository;
	}
	
	public List<Contatto> listaContatti(){
		return contattoRepository.listaContatti();
	}
	
	public Contatto getContattoById(Integer id) throws ContattoException{
		return contattoRepository.getContattoById(id);
	}
	
	public Contatto addContatto(Contatto newContatto) throws ContattoException{
		return contattoRepository.addContatto(newContatto);
	}
	
	public Contatto modContatto (Contatto contatto, Integer id) throws ContattoException{
		return contattoRepository.modContatto(contatto, id);
	}
	
	public void eliminaContatto (Integer id) throws ContattoException {
		contattoRepository.eliminaContatto(id);
		return;
	}
	
}


