package com.produtos.Apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.Apirest.models.Produto;

public interface ProdutoRepositry extends JpaRepository<Produto, Long> {
	
	Produto findById(long id);
	

}
