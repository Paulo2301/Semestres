package com.ifpi.ted2019.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/semestres")
public class SemestreResources {
	@RequestMapping(method = RequestMethod.GET)
	public String listar(){
		return "Rest Funcionando";
	}
}
