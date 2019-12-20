package com.viniciuscolutti.moonrain.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viniciuscolutti.moonrain.domain.Estado;
import com.viniciuscolutti.moonrain.repositories.EstadoRepository;

@Service
public class EstadoService {
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	
	public List<Estado> findAllByOrderByNome(){
		return estadoRepository.findAllByOrderByNome();
	}

}
