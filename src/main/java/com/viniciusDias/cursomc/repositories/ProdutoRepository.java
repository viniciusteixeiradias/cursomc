package com.viniciusDias.cursomc.repositories;

import com.viniciusDias.cursomc.domain.Produto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
