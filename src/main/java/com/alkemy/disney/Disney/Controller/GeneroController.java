package com.alkemy.disney.Disney.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alkemy.disney.Disney.Dto.GeneroDTO;
import com.alkemy.disney.Disney.Service.GeneroService;
import com.alkemy.disney.Disney.Service.Impl.GeneroServiceImpl;

@RestController
@RequestMapping("/generos")
public class GeneroController {
	
	@Autowired
	private GeneroService generoService;
	@PostMapping
	public ResponseEntity <GeneroDTO> save (@RequestBody GeneroDTO genero) {
		GeneroDTO generoGuardado=generoService.save(genero);
		return ResponseEntity.status(HttpStatus.CREATED).body(generoGuardado);
		
	}

}
