package com.alkemy.disney.Disney.Entity;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="personaje")
@Getter
@Setter
public class PersonajeEntity {

	  
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
	
	private String imagen;
	
	private String nombre;
	private Long edad;
	private String peso;
	private String historia;
	
	private boolean deleted= Boolean.FALSE;
	
	@ManyToMany(mappedBy="personajes", cascade=CascadeType.ALL)
	private List<PeliculaEntity> peliculas =new ArrayList<>();
	
	

}