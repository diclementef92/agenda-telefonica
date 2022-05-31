package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.ContattoRepository;

@SpringBootApplication
public class DemoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("welcome to boot");
		//ContattoRepository contattoRepository = new ContattoRepository();
		//List<Contatto> contatti = contattoRepository.listaContatti();

		
	}
	
	
}
