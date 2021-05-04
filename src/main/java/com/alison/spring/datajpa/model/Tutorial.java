package com.alison.spring.datajpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="tutorial")
public class Tutorial {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="Titulo")
	private String titulo;
	
	@Column(name="Descricao")
	private String descricao;
	
	@Column(name="Publicado")
	private boolean publicado;
	

	public Tutorial() {

	}

		
		
}
