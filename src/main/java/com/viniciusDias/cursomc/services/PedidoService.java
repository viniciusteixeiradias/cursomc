package com.viniciusDias.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import com.viniciusDias.cursomc.domain.Pedido;
import com.viniciusDias.cursomc.repositories.PedidoRepository;
import com.viniciusDias.cursomc.services.exception.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: "+ id
					+ ", Tipo: "+ Pedido.class.getName()));
	}
}
