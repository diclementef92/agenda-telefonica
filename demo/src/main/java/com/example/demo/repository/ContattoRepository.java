package com.example.demo.repository;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.domain.Contatto;
import com.example.demo.exception.ContattoException;;

@Repository
public class ContattoRepository {

	private List<Contatto> contatti = new LinkedList<>();
	
	public ContattoRepository() {
		
		contatti.add(new Contatto(1,"Marco","Rossi","023455436"));
		contatti.add(new Contatto(2,"Mario","Valsecchi","+391455436"));
		contatti.add(new Contatto(3,"Sara","Presazzi","08765432"));

	}
	
	public List<Contatto> listaContatti(){
		
		return contatti;
	}
	
	public Contatto getContattoById(Integer id) throws ContattoException {
		for(Contatto c: contatti) {
			if(c.getId() == id) {
				return c;
			}
		}
		throw new ContattoException("contatto con id: " + id + " non trovato");
		
	}

	public Contatto addContatto(Contatto newContatto) throws ContattoException {
		
		if(contatti.add(newContatto) == true) {
			return newContatto;
		}
		
		throw new ContattoException("contatto: " + newContatto.toString() + " non aggiunto");
		
	}
	
	public Contatto modContatto(Contatto contatto, Integer id) throws ContattoException{
		
		for(Contatto c: contatti) {
			if(c.getId() == id ) {
				if (contatto.getNome() != null) {
					c.setNome(contatto.getNome());
				}
				if (contatto.getCognome() != null) {
					c.setCognome(contatto.getCognome());
				}
				if (contatto.getTelefono() != null) {
					c.setTelefono(contatto.getTelefono());
				}
				
				return c;
			}
		}
		
		throw new ContattoException("contatto: " + contatto.toString() + " non modificato");
		
	}
	
	public void eliminaContatto(Integer id) throws ContattoException  {
		try {
			Contatto c = getContattoById(id);
			contatti.remove(contatti.indexOf(c));
		}catch(IndexOutOfBoundsException e) {
			throw new ContattoException("id: " + id + " index out of bound");
		}catch(Exception ex) {
			throw new ContattoException(ex.getMessage());
		}
		
	
	}
	
	
}
