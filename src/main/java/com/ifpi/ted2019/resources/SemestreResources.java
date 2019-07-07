package com.ifpi.ted2019.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ifpi.ted2019.domain.Semestre;
import com.ifpi.ted2019.services.SemestreService;

@RestController
@RequestMapping(value = "/semestres")
public class SemestreResources {
	
	private SemestreService service;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id){
		Semestre object = service.buscar(id);
		return ResponseEntity.ok().body(object);
	}
}
