package com.viniciuscolutti.moonrain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viniciuscolutti.moonrain.domain.Pagamento;


@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {
	
}
