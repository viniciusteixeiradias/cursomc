package com.viniciusDias.cursomc.repositories;

import com.viniciusDias.cursomc.domain.Pagamento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer>{

}
