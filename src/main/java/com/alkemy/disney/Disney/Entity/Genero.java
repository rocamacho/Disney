package com.alkemy.disney.Disney.Entity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

	@Entity
	@Getter
	@Setter
	public class Genero {
		  
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
		
		private String nombre;
		
		private String imagen;

	}


