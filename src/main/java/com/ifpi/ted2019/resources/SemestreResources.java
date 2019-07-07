package com.ifpi.ted2019.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ifpi.ted2019.domain.Semestre;

@RestController
@RequestMapping(value = "/semestres")
public class SemestreResources {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Semestre> listar(){
		List<Semestre> semestre= new ArrayList<Semestre>();
		semestre.add(new Semestre(1, 2019, 2));
		semestre.add(new Semestre(2, 2017, 1));
		return semestre;
	}
}
