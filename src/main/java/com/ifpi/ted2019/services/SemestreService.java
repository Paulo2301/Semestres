package com.ifpi.ted2019.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifpi.ted2019.domain.Semestre;
import com.ifpi.ted2019.repositories.SemestreRepository;

@Service
public class SemestreService {
	
	@Autowired
	private SemestreRepository repository;
	
	public Semestre buscar(Integer id) {
		Optional<Semestre> object = repository.findById(id);
		return object.orElse(null);
	}

}
