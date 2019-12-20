package com.viniciuscolutti.moonrain.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;
import com.viniciuscolutti.moonrain.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
	
	
	@Transactional(readOnly=true)
	public List<Estado> findAllByOrderByNome();
	
}
