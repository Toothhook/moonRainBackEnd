package com.viniciuscolutti.moonrain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viniciuscolutti.moonrain.domain.itemPedido;

@Repository
public interface ItemPedidoRepository extends JpaRepository<itemPedido, Integer> {
	
}
