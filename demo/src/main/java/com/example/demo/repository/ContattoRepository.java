package com.example.demo.repository;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.domain.Contatto;
import com.example.demo.exception.ContattoException;;

@Repository
public class ContattoRepository {

	private List<Contatto> contatti ;
	
	public ContattoRepository() {
		
		contatti.add(new Contatto(1,"Marco","Rossi","023455436"));
		contatti.add(new Contatto(2,"Mario","Valsecchi","+39345543620"));
		contatti.add(new Contatto(3,"Sara","Presazzi","08765432"));

	}

	/**
	 * restituisce tutta la lista contatti
	 * @return lista contatti
	 */
	public List<Contatto> listaContatti(){
		
		return contatti;
	}
	
	/**
	 * Restituisce un contatto dato un id 
	 * @param id Contatto 
	 * @return Contatto  se trovato
	 * @throws ContattoException se non trovato
	 * */
	public Contatto getContattoById(Integer id) throws ContattoException {
		for(Contatto c: contatti) {
			if(c.getId() == id) {
				return c;
			}
		}
		throw new ContattoException("contatto con id: " + id + " non trovato");
		
	}

	/**
	 * Aggiunge un nuovo contatto
	 * @param newContatto da aggiungere 
	 * @return contatto aggiunto
	 * @throws ContattoException se non aggiunto
	 */
	public Contatto addContatto(Contatto newContatto) throws ContattoException {
		
		if(contatti.add(newContatto) == true) {
			return newContatto;
		}
		
		throw new ContattoException("contatto: " + newContatto.toString() + " non aggiunto");
		
	}
	
	/**
	 * Modifica un contatto 
	 * @param contatto con dati modificati
	 * @param id del contatto da modificare
	 * @return contatto modifiicato
	 * @throws ContattoException se non modificato
	 */
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
	
	/**
	 * Elimina un contatto per id
	 * @param id del contatto da eliminare
	 * @throws ContattoException se errore 
	 */
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
