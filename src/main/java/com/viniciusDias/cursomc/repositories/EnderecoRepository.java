package com.viniciusDias.cursomc.repositories;

import com.viniciusDias.cursomc.domain.Endereco;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{

}
