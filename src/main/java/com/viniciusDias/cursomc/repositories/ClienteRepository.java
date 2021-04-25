package com.viniciusDias.cursomc.repositories;

import com.viniciusDias.cursomc.domain.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
