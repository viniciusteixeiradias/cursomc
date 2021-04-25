package com.viniciusDias.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import com.viniciusDias.cursomc.domain.Categoria;
import com.viniciusDias.cursomc.repositories.CategoriaRepository;
import com.viniciusDias.cursomc.services.exception.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: "+ id
					+ ", Tipo: "+ Categoria.class.getName()));
	}
}
