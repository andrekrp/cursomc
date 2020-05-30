package com.reguse.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reguse.cursomc.domain.Categoria;
import com.reguse.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscas(Integer id) {
		java.util.Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
		}
		
		
	}


