package com.viniciusDias.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import com.viniciusDias.cursomc.domain.Cliente;
import com.viniciusDias.cursomc.repositories.ClienteRepository;
import com.viniciusDias.cursomc.services.exception.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: "+ id
					+ ", Tipo: "+ Cliente.class.getName()));
	}
}
