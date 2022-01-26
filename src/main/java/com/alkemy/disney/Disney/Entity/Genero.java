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

		public void setNombre(String nombre) {
			// TODO Auto-generated method stub
			
		}

		public void setImagen(String imagen) {
			// TODO Auto-generated method stub
			
		}

	
   	}


