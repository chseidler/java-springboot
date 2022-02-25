package com.chseidler.exerciciossb.model.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.chseidler.exerciciossb.model.entities.Produto;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {
	
	public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);

}
