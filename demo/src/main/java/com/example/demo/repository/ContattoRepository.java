package com.example.demo.repository;

import java.util.LinkedList;

import org.springframework.stereotype.Repository;

import com.example.demo.domain.Contatto;;

@Repository
public class ContattoRepository {

	private LinkedList<Contatto> contatti = new LinkedList<Contatto>();
	
	public ContattoRepository() {
		//contatti = new LinkedList<Contatto>();
		contatti.add(new Contatto(1,"Marco","Rossi","023455436"));
		contatti.add(new Contatto(2,"Mario","Valsecchi","+391455436"));
		contatti.add(new Contatto(3,"Sara","Presazzi","08765432"));


	}
	
	public LinkedList<Contatto> listaContatti(){
		
		return contatti;
	}
	
	public Contatto getContattoById(Integer id) {
		Contatto contatto = null;

		try {
			contatto = contatti.get(id);
			
		}catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
			
		}
		
		return contatto;
		
		//if (id >=1 && id<= contatti.size()) {
		//	return contatti.get(id);
		//}
		//return null;
	}

}
