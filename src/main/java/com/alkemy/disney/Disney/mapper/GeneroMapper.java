package com.alkemy.disney.Disney.mapper;

import org.springframework.stereotype.Component;

import com.alkemy.disney.Disney.Dto.GeneroDTO;
import com.alkemy.disney.Disney.Entity.Genero;

@Component
public class GeneroMapper {
	public Genero generoDTO2Entity (GeneroDTO dto) {
		Genero Genero=new Genero();
		Genero.setNombre(dto.getNombre());
		Genero.setImagen(dto.getImagen());
		return Genero;
		
	}
	

	public GeneroDTO  generoEntity2DTO (Genero entity) {
		GeneroDTO dto= new GeneroDTO();
		dto.setId(entity.getId());
		dto.setNombre(entity.getNombre());
		dto.setImagen(entity.getImagen());
	    return dto;
			
	}		
}
