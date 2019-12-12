package com.viniciuscolutti.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viniciuscolutti.cursomc.domain.itemPedido;

@Repository
public interface ItemPedidoRepository extends JpaRepository<itemPedido, Integer> {
	
}
