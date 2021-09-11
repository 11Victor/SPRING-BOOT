package com.generation.lojadegames.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.lojadegames.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	public List <Produto> findAllByNomeContainingIgnoreCase(String nome);
	public List <Produto> findAllByDescricaoContainingIgnoreCase(String descricao);
	public List <Produto> findByPrecoGreaterThan(BigDecimal preco);
	public List <Produto> findByPrecoLessThan(BigDecimal preco);
	
	
}
