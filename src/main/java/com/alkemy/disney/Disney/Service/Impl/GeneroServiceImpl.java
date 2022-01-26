package com.alkemy.disney.Disney.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alkemy.disney.Disney.Dto.GeneroDTO;
import com.alkemy.disney.Disney.Entity.Genero;
import com.alkemy.disney.Disney.Repository.GeneroRepository;
import com.alkemy.disney.Disney.Service.GeneroService;
import com.alkemy.disney.Disney.mapper.GeneroMapper;

@Service
public class GeneroServiceImpl implements GeneroService {
	  
	
	@Autowired
	private GeneroMapper generoMapper;
	
	@Autowired
	private GeneroRepository generoRepository;
	
	public GeneroDTO save(GeneroDTO dto) {
		Genero entity=generoMapper.generoDTO2Entity(dto);
		Genero entitysaved = generoRepository.save(entity);
		GeneroDTO result =generoMapper.generoEntity2DTO(entitysaved);
		return result;
	}

}
