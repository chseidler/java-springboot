package com.chseidler.exerciciossb.model.repositories;

import org.springframework.data.repository.CrudRepository;

import com.chseidler.exerciciossb.model.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
	
	

}
