package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
public class UserEntity {
	
	@Id
	@GeneratedValue (strategy=GenerationType.SEQUENCE)
	private Long id;
	
	@Column
	private String firstName;
	
	
	
}
