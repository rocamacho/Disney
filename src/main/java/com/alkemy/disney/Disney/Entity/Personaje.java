package com.alkemy.disney.Disney.Entity;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Personaje {

	  
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String imagen;
	
	private String nombre;
	private Long edad;
	private String peso;
	private String historia;
	
	private boolean deleted= Boolean.FALSE;
	
	@ManyToMany(mappedBy="personajes", cascade=CascadeType.ALL)
	private List<Pelicula> peliculas =new ArrayList<>();
	
	

}